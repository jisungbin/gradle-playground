@file:Suppress("UnstableApiUsage")

rootProject.name = "gradle-playground"

pluginManagement {
  repositories {
    mavenLocal()
    google()
    mavenCentral()
    gradlePluginPortal()
  }
}

include(
  ":playground",
  ":app",
)
