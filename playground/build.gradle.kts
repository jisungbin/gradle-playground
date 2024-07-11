plugins {
  `kotlin-dsl`
  `java-gradle-plugin`
}

gradlePlugin {
  plugins {
    create("gradle-playground-plugin") {
      id = "land.sungbin.gradleplayground.plugin"
      implementationClass = "GradlePlaygroundPlugin"
    }
  }
}

val testVersion by rootProject.properties
println("testVersion is $testVersion")

dependencies {
  compileOnly("org.jetbrains.kotlin:kotlin-gradle-plugin-api:1.9.23")
}
