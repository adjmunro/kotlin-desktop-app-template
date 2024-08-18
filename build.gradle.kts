import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    alias(libs.plugins.kotlin.jvm) apply false
    alias(libs.plugins.kotlinx.atomicfu) apply false
    alias(libs.plugins.kotlinx.serialization) apply false
}

subprojects {
    tasks.withType<KotlinCompile>().configureEach {
        compilerOptions {
           // jvmTarget = libs.versions.java.language.target.get()

            freeCompilerArgs.addAll(
                // Add support for @JvmDefault - use "all" or "all-compatibility"
                "-Xjvm-default=all",

                // Allow multiple context receivers.
                "-Xcontext-receivers"
            )
        }
    }
}
