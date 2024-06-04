plugins {
  `maven-publish`
  `java-library`
}

allprojects {

  apply(plugin = "java-library")
  apply(plugin = "maven-publish")

  group = "com.example"
  version = "1.0.0-SNAPSHOT"

  repositories {
    mavenCentral()
    mavenLocal()
  }

  java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
  }

  tasks.withType<Test> {
    systemProperty("java.util.logging.manager", "org.jboss.logmanager.LogManager")
  }

  val quarkusPlatformGroupId: String by project
  val quarkusPlatformArtifactId: String by project
  val quarkusPlatformVersion: String by project
  dependencies {
    implementation(enforcedPlatform("${quarkusPlatformGroupId}:${quarkusPlatformArtifactId}:${quarkusPlatformVersion}"))
  }

}