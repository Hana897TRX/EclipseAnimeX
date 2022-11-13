plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
    id(Plugins.KAPT_PLUGIN)
}

android {
    namespace = "com.hana897trx.repository"
    compileSdk = 32

    packagingOptions {
        resources.excludes.add("META-INF/*")
    }

    defaultConfig {
        minSdk = 26
        targetSdk = 32

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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
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