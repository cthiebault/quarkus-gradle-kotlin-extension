plugins {
  kotlin("jvm")
  id("io.quarkus.extension")
}

dependencies {
  implementation("io.quarkus:quarkus-arc")

  testImplementation("io.quarkus:quarkus-junit5")
}

quarkusExtension {
  deploymentModule = ":extension:deployment"
}