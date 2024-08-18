plugins {
    alias(libs.plugins.kotlin.jvm)
    alias(libs.plugins.kotlinx.atomicfu)
    application
}

group = "nz.adjmunro.ignite-kotlin"
version = "1.0.0"

application {
    mainClass.set("nz.adjmunro.app.Application")
}

kotlin {
    jvmToolchain(libs.versions.java.language.target.get().toInt())
}

tasks.test {
    useJUnitPlatform()
}


dependencies {
    implementation(libs.bundles.kotlin.core)
    testImplementation(libs.bundles.kotlin.test)
}
