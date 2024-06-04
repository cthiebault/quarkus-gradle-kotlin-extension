dependencies {
  implementation(project(":extension:runtime"))
  implementation("io.quarkus:quarkus-resteasy-jsonb")

  testImplementation("io.quarkus:quarkus-junit5")
  testImplementation("io.rest-assured:rest-assured")
}
