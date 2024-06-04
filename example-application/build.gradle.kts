plugins {
  kotlin("jvm")
  kotlin("plugin.allopen")
  id("io.quarkus")
}

dependencies {
  implementation(project(":extension:runtime"))
  implementation("io.quarkus:quarkus-resteasy-jsonb")

  testImplementation("io.quarkus:quarkus-junit5")
  testImplementation("io.rest-assured:rest-assured")
}

allOpen {
  annotation("jakarta.enterprise.context.ApplicationScoped")
  annotation("io.quarkus.test.junit.QuarkusTest")
}