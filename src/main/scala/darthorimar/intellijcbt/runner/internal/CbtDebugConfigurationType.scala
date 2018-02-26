package darthorimar.intellijcbt.runner.internal

import javax.swing.Icon

import com.intellij.execution.configurations.{ConfigurationFactory, ConfigurationType}
import com.intellij.openapi.project.DumbAware
import darthorimar.intellijcbt.CBT

class CbtDebugConfigurationType extends ConfigurationType with DumbAware {
  def getIcon: Icon = CBT.Icon

  def getDisplayName: String = "CBT Debug"

  def getConfigurationTypeDescription: String = "CBT Debug"

  def getConfigurationFactories: Array[ConfigurationFactory] = Array.empty

  def getId: String = "CbtRunDebugConfiguration"
}

object CbtDebugConfigurationType {
  def getInstance = new CbtDebugConfigurationType
}


