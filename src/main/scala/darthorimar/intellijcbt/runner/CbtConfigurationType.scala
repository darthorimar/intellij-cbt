package darthorimar.intellijcbt.runner

import javax.swing.Icon

import com.intellij.execution.configurations.{ConfigurationFactory, ConfigurationType}
import com.intellij.openapi.project.DumbAware
import darthorimar.intellijcbt.CBT

class CbtConfigurationType extends ConfigurationType with DumbAware {
  val confFactory = new CbtRunConfigurationFactory(this)

  def getIcon: Icon = CBT.Icon

  def getDisplayName: String = "CBT Task"

  def getConfigurationTypeDescription: String = "Run CBT Task"

  def getConfigurationFactories: Array[ConfigurationFactory] =
    Array[ConfigurationFactory](confFactory)

  def getId: String = "CbtRunConfiguration"
}

object CbtConfigurationType {
  def getInstance = new CbtConfigurationType
}