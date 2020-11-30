plugins {
    `java-library`
    kotlin("jvm") version "1.4.20" apply false
    kotlin("plugin.spring") version "1.4.20" apply false
    id("org.springframework.boot") version "2.4.0" apply false
    id("org.jruyi.thrift") version "0.4.1" apply false
}

group = "me.tony.tonyirl.account"
version = "1.0.0"

val javaVersion = "11"
val infBomVersion = "1.0.4"

allprojects {
    apply<JavaLibraryPlugin>()

    java {
        sourceCompatibility = JavaVersion.toVersion(javaVersion)
        targetCompatibility = JavaVersion.toVersion(javaVersion)
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

subprojects {
    dependencies {
        implementation(platform("me.tonyirl:inf-bom:$infBomVersion"))
    }

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = javaVersion
        }
    }
}
