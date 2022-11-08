import org.gradle.api.JavaVersion

object Config {
    const val MIN_SDK = 22
    const val TARGET_SDK = 33
    const val COMPILE_SDK = 33
    const val APP_CODE_VERSION = 1
    const val VERSION_CODE_NAME = "1.0"
    const val JVM_TARGET = "11"
    val JAVA_VERSION = JavaVersion.VERSION_11
}