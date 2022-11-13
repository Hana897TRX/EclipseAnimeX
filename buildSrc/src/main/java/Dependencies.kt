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
    const val FIREBASE_CP_VER = "4.3.13"
    const val FIREBASE_BOM_VER = "31.0.2"
    const val FIREBASE_DM_VER = "16.0.0-beta01"
    const val FIREBASE_DB_VER = "20.1.0"
    const val FIREBASE_AL_VER = "21.2.0"
    const val FIREBASE_FS_VER = "24.4.0"
    const val FIRESTORE_COROUTINES_VER = "1.6.4"
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
    const val FIREBASE_BOM_DEP = "com.google.firebase:firebase-bom:${Versions.FIREBASE_BOM_VER}"
    const val FIREBASE_ANALYTICS_DEP = "com.google.firebase:firebase-analytics-ktx:${Versions.FIREBASE_AL_VER}"
    const val FIREBASE_DYNAMIC_MODULE_DEP = "com.google.firebase:firebase-dynamic-module-support:${Versions.FIREBASE_DM_VER}"
    const val FIREBASE_DATABASE_DEP = "com.google.firebase:firebase-database"
    const val FIREBASE_DB_DEP = "com.google.firebase:firebase-database-ktx:${Versions.FIREBASE_DB_VER}"
    const val FIREBASE_FS_DEP = "com.google.firebase:firebase-firestore-ktx:${Versions.FIREBASE_FS_VER}"
    const val FIREBASE_COROUTINES_DEP = "org.jetbrains.kotlinx:kotlinx-coroutines-play-services:${Versions.FIRESTORE_COROUTINES_VER}"
}

object Plugins {
    const val DAGGER_HILT_PLUGIN = "com.google.dagger.hilt.android"
    const val FIREBASE_PLUGIN = "com.google.gms.google-services"
    const val KAPT_PLUGIN = "kotlin-kapt"
}

object ClassPath {
    const val DAGGER_HILT_CP = "com.google.dagger:hilt-android-gradle-plugin:${Versions.DAGGER_HILT_VER}"
    const val FIREBASE_CP = "com.google.gms:google-services:${Versions.FIREBASE_CP_VER}"
}