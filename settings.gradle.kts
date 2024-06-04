pluginManagement {
  val kotlinVersion: String by settings
  val quarkusPluginVersion: String by settings
  val quarkusPluginId: String by settings
  val quarkusPlatformVersion: String by settings
  repositories {
    mavenCentral()
    gradlePluginPortal()
    mavenLocal()
  }
  plugins {
    id(quarkusPluginId) version quarkusPluginVersion
    id("io.quarkus.extension") version quarkusPlatformVersion
    kotlin("jvm") version kotlinVersion
    kotlin("plugin.allopen") version kotlinVersion
  }
}
rootProject.name = "gradle-kotlin-extension"
include(
  "example-application",
  ":extension:deployment",
  ":extension:runtime",
)
