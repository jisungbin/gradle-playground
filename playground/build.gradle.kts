plugins {
  `kotlin-dsl`
  id("com.vanniktech.maven.publish") version "0.28.0"
}

gradlePlugin {
  plugins {
    create("gradle-playground-plugin") {
      id = "land.sungbin.gradleplayground.plugin"
      implementationClass = "GradlePlaygroundPlugin"
    }
  }
}

dependencies {
  compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin-api:1.9.23")
}
