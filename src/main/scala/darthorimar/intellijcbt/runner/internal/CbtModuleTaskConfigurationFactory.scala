package darthorimar.intellijcbt.runner.internal

import com.intellij.execution.configurations.{ConfigurationFactory, ConfigurationType, RunConfiguration}
import com.intellij.openapi.project.Project
import darthorimar.intellijcbt.runner.CbtTask

class CbtModuleTaskConfigurationFactory(task: CbtTask, configurationType: ConfigurationType)
  extends ConfigurationFactory(configurationType) {
  override def createTemplateConfiguration(project: Project): RunConfiguration =
    new CbtModuleTaskConfiguration(task, this)
}
