plugins {
  kotlin("jvm")
  id("land.sungbin.gradleplayground.plugin") version "1.0.0"
}

dependencies {
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.8.0")
  implementation("org.jetbrains.kotlinx:kotlinx-collections-immutable:+")
}
