object Versions {
    const val CORE_VERSION = "1.9.0"
    const val MATERIAL_VER = "1.7.0"
    const val CONSTRAINT_LAY_VER = "2.1.4"
    const val NAV_VER = "2.5.3"
    const val JUNIT_VER = "4.13.2"
    const val JUNIT_EXT_VER = "1.1.3"
    const val ESPRESSO_VER = "3.4.0"
    const val LIFECYCLE_VER = "2.4.0"
    const val RETROFIT_VER = "2.9.0"
    const val COROUTINES_VER = "1.3.6"
    const val DAGGER_HILT_VER = "2.44"
}

object Dependencies {
    const val ANDROID_CORE = "androidx.core:core-ktx:${Versions.CORE_VERSION}"
    const val MATERIAL_DEP = "com.google.android.material:material:${Versions.MATERIAL_VER}"
    const val CONSTRAINT_LAY_DEP = "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAY_VER}"
    const val NAVIGATION_FRAGMENT_DEP = "androidx.navigation:navigation-fragment-ktx:${Versions.NAV_VER}"
    const val NAVIGATION_UI_DEP = "androidx.navigation:navigation-ui-ktx:${Versions.NAV_VER}"
    const val JUNIT_DEP = "junit:junit:${Versions.JUNIT_VER}"
    const val JUNIT_EXT_DEP = "androidx.test.ext:junit:${Versions.JUNIT_EXT_VER}"
    const val ESPRESSO_DEP = "androidx.test.espresso:espresso-core:${Versions.ESPRESSO_VER}"
    const val VIEW_MODEL_SCOPE_DEP = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.LIFECYCLE_VER}"
    const val LIFECYCLE_RUNTIME_DEP = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.LIFECYCLE_VER}"
    const val RETROFIT_DEP = "com.squareup.retrofit2:retrofit:${Versions.RETROFIT_VER}"
    const val RETROFIT_GSON_DEP = "com.squareup.retrofit2:converter-gson:${Versions.RETROFIT_VER}"
    const val COROUTINES_DEP = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.COROUTINES_VER}"
    const val DAGGER_HILT_DEP = "com.google.dagger:hilt-android:${Versions.DAGGER_HILT_VER}"
    const val DAGGER_HILT_COMPILER_DEP = "com.google.dagger:hilt-compiler:${Versions.DAGGER_HILT_VER}"
}

object Plugins {
    const val DAGGER_HILT_PLUGIN = "com.google.dagger.hilt.android"
}

object ClassPath {
    const val DAGGER_HILT_CP = "com.google.dagger:hilt-android-gradle-plugin:${Versions.DAGGER_HILT_VER}"
}