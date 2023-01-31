plugins {
    kotlin("jvm")
    application
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(19))
        vendor.set(JvmVendorSpec.BELLSOFT)
    }
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

dependencies {
    implementation("com.displee:disio:2.2")
    implementation("com.displee:rs-cache-library:6.8.1")

    val jettyVersion = "11.0.13"
    implementation("org.eclipse.jetty:jetty-io:$jettyVersion")
    implementation("org.eclipse.jetty:jetty-server:$jettyVersion")
    implementation("org.eclipse.jetty:jetty-http:$jettyVersion")
    implementation("org.eclipse.jetty:jetty-util:$jettyVersion")

    implementation("javax.servlet:javax.servlet-api:4.0.1")
    implementation("org.fxmisc.richtext:richtextfx:0.11.0")
    implementation("com.google.code.gson:gson:2.10.1")
    implementation("org.apache.commons:commons-lang3:3.12.0")

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
}

application {
    mainClass.set("com.displee.editor.Editor")
}
