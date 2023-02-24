import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    id("io.izzel.taboolib") version "1.56"
}

group = "cc.originx.rigel"
version = "2.0.0"

repositories {
    mavenCentral()
}

taboolib{
    description {
        prefix("OriginX-LevelSystem")
        load("POSTWORLD")
        desc("A Minecraft Plugin")
        contributors{
            name("lrd1122")
        }
    }
    version = "6.0.10-91"
    install("common")
    install("platform-bukkit")
}
dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}