pluginManagement.repositories {
    gradlePluginPortal()
    maven {
        name = "Fabric"
        url = uri("https://maven.fabricmc.net/")
    }
    maven {
        name = "Sponge Snapshots"
        url = uri("https://repo.spongepowered.org/repository/maven-public/")
    }
    maven { url = uri("https://maven.neoforged.net/releases") }
}

rootProject.name = "BYG"
include("Common", "Fabric")