import org.gradle.api.Plugin
import org.gradle.api.Project

@Suppress("unused")
class GradlePlaygroundPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    target.logger.lifecycle("Hello, GradlePlaygroundPlugin!")
  }
}
