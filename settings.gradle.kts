pluginManagement {
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
  }
}
rootProject.name = "gradle-kotlin-extension"
include(
  "example-application",
  ":extension:deployment",
  ":extension:runtime",
)
