plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.hana897trx.lib"
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
    implementation(Dependencies.ANDROID_CORE)
    implementation(Dependencies.MATERIAL_DEP)
    testImplementation(Dependencies.JUNIT_DEP)
    androidTestImplementation(Dependencies.JUNIT_EXT_DEP)
    androidTestImplementation(Dependencies.ESPRESSO_DEP)
}