plugins {
    kotlin("jvm") version "1.5.30"
    id("com.github.johnrengelman.shadow") version "7.0.0"
}

group = "nl.chimpgamer.networkmanager.extensions"
version = "1.0.0-SNAPSHOT"
description = "JoinMessages"

repositories {
    mavenCentral()
    maven("https://repo.networkmanager.xyz/repository/maven-public")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
}

dependencies {
    compileOnly(kotlin("stdlib-jdk8"))
    compileOnly("nl.chimpgamer.networkmanager:api:2.10.0")
    compileOnly("net.md-5:bungeecord-api:1.17-R0.1-SNAPSHOT")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }

    processResources {
        expand("version" to project.version)
    }

    shadowJar {
        archiveFileName.set("${project.name}-v${project.version}.jar")

        val libPackage = "nl.chimpgamer.networkmanager.lib"
        relocate("kotlin", "$libPackage.kotlin")
        relocate("org.simpleyaml", "$libPackage.simpleyaml")
    }

    build {
        dependsOn(shadowJar)
    }

    jar {
        enabled = false
    }
}