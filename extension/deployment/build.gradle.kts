dependencies {
  implementation(project(":extension:runtime"))
  implementation("io.quarkus:quarkus-arc-deployment")

  testImplementation("io.quarkus:quarkus-junit5-internal")
}
