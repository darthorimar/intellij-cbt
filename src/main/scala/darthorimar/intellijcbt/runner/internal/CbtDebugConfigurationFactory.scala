package darthorimar.intellijcbt.runner.internal

import com.intellij.execution.configurations.{ConfigurationFactory, ConfigurationType, RunConfiguration}
import com.intellij.openapi.project.Project
import darthorimar.intellijcbt.runner.CbtTask

class CbtDebugConfigurationFactory(task: CbtTask, configType: ConfigurationType)
  extends ConfigurationFactory(configType) {
  override def createTemplateConfiguration(project: Project): RunConfiguration =
    new CbtDebugConfiguration(task.copy(project = project), this)
}
