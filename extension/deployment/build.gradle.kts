plugins {
  kotlin("jvm")
}

dependencies {
  implementation(project(":extension:runtime"))
  implementation("io.quarkus:quarkus-arc-deployment")
  implementation("io.quarkus:quarkus-kotlin-deployment")

  testImplementation("io.quarkus:quarkus-junit5-internal")
}