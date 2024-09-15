plugins {
    id("java")
    id("dev.architectury.loom") version("1.6-SNAPSHOT")
    id("architectury-plugin") version("3.4-SNAPSHOT")
    kotlin("jvm") version ("1.8.10")
}

group = "org.example"
version = "1.0.0-SNAPSHOT"

architectury {
    platformSetupLoomIde()
    fabric()
}

loom {
    silentMojangMappingsLicense()
    accessWidenerPath.set(file("src/main/resources/cobblemon_structures.accesswidener"))
    runs {
        // This adds a new Gradle task that runs the datagen API
        create("datagen") {
            inherit(runs.getByName("server"))
            name = "Data Generation"
            vmArgs(
                "-Dfabric-api.datagen",
                "-Dfabric-api.datagen.output-dir=${project.file("src/main/generated")}",
                "-Dfabric-api.datagen.modid=cobblemon_structures"
            )
            runDir = "build/datagen"
        }
    }
}



repositories {
    mavenCentral()
    maven(url = "https://dl.cloudsmith.io/public/geckolib3/geckolib/maven/")
    maven("https://maven.impactdev.net/repository/development/")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven {
        name = "Modrinth"
        url = uri("https://api.modrinth.com/maven")
        content {
            includeGroup("maven.modrinth")
        }
    }
}

sourceSets {
    named("main") {
        resources {
            srcDir("src/main/generated")
        }
    }
}

dependencies {
    minecraft("net.minecraft:minecraft:1.20.1")
    mappings("net.fabricmc:yarn:${project.properties["yarn_mappings"]}:v2")
    modImplementation("net.fabricmc:fabric-loader:0.16.0")

    modImplementation("net.fabricmc.fabric-api:fabric-api:${project.properties["fabric_version"]}")
    modImplementation("com.cobblemon:fabric:${project.properties["cobblemon_version"]}")
    modImplementation("maven.modrinth:structure-pool-api:${project.properties["structure_pool_api_version"]}")
}


tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
