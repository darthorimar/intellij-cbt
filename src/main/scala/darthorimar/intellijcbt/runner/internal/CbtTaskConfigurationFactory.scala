package darthorimar.intellijcbt.runner.internal

import com.intellij.execution.configurations.{ConfigurationFactory, ConfigurationType, RunConfiguration}
import com.intellij.openapi.project.Project
import darthorimar.intellijcbt.runner.CbtTask

class CbtTaskConfigurationFactory(task: CbtTask, confType: ConfigurationType)
  extends ConfigurationFactory(confType) {
  override def createTemplateConfiguration(project: Project): RunConfiguration =
    new CbtTaskConfiguration(task.copy(project = project), this)
}

