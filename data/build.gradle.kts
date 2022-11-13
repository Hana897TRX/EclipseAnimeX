plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id("kotlin-kapt")
    id(Plugins.FIREBASE_PLUGIN)
}

android {
    packagingOptions {
        resources.excludes.add("META-INF/*")
    }

    namespace = PackageNames.DATA_PACKAGE_NAME
    compileSdk = Config.COMPILE_SDK

    defaultConfig {
        minSdk = Config.MIN_SDK
        targetSdk = Config.TARGET_SDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = Config.JAVA_VERSION
        targetCompatibility = Config.JAVA_VERSION
    }
    kotlinOptions {
        jvmTarget = Config.JVM_TARGET
    }
}

dependencies {
    implementation(project(Module.LIB_MODULE))
    implementation(Dependencies.ANDROID_CORE)
    implementation(Dependencies.COROUTINES_DEP)

    implementation(Dependencies.DAGGER_HILT_DEP)
    kapt(Dependencies.DAGGER_HILT_COMPILER_DEP)

    implementation(Dependencies.FIREBASE_BOM_DEP)
    implementation(Dependencies.FIREBASE_ANALYTICS_DEP)
    implementation(Dependencies.FIREBASE_FS_DEP)
    implementation(Dependencies.FIREBASE_COROUTINES_DEP)

    testImplementation(Dependencies.JUNIT_DEP)
    androidTestImplementation(Dependencies.JUNIT_EXT_DEP)
    androidTestImplementation(Dependencies.ESPRESSO_DEP)
}