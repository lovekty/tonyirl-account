plugins {
    kotlin("jvm")
    kotlin("plugin.spring")
}

dependencies {
    implementation(project(":account-api"))
    implementation(kotlin("stdlib-jdk8"))
    implementation(kotlin("reflect"))
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    implementation("me.tonyirl.tremote:tremote-core:1.0.0")
}