import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
class GradlePlaygroundPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    target.logger.lifecycle("Hello, GradlePlaygroundPlugin!")
    target.tasks.register("testt") {
      target.configurations.forEach { configuration ->
        configuration.dependencies.forEach dep@{ dep ->
          target.logger.lifecycle("[${configuration.name}] Found dependency: ${dep.group}:${dep.name}:${dep.version}")
        }
      }
    }
  }
}
