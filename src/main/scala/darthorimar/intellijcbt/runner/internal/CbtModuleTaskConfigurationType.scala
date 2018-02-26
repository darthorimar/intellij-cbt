package darthorimar.intellijcbt.runner.internal

import javax.swing.Icon

import com.intellij.execution.configurations.{ConfigurationFactory, ConfigurationType}
import com.intellij.openapi.project.DumbAware
import darthorimar.intellijcbt.CBT

class CbtModuleTaskConfigurationType extends ConfigurationType with DumbAware {
  def getIcon: Icon = CBT.Icon

  def getDisplayName: String = "CBT Internal Task"

  def getConfigurationTypeDescription: String = "CBT Internal Task"

  def getConfigurationFactories: Array[ConfigurationFactory] = Array.empty

  def getId: String = "CbtModuleTaskConfiguration"
}

object CbtModuleTaskConfigurationType {
  def getInstance = new CbtModuleTaskConfigurationType
}


