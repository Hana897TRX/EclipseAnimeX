plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id(Plugins.KAPT_PLUGIN)
}

android {
    namespace = "com.hana897trx.repository"
    compileSdk = Config.COMPILE_SDK

    packagingOptions {
        resources.excludes.add("META-INF/*")
    }

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
    implementation(project(Module.DATA_MODULE))
    implementation(project(Module.LIB_MODULE))

    testImplementation(Dependencies.JUNIT_DEP)
    androidTestImplementation(Dependencies.JUNIT_EXT_DEP)
    androidTestImplementation(Dependencies.ESPRESSO_DEP)

    implementation(Dependencies.COROUTINES_DEP)

    implementation(Dependencies.DAGGER_HILT_DEP)
    kapt(Dependencies.DAGGER_HILT_COMPILER_DEP)
}