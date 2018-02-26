package darthorimar.intellijcbt.project.template

import javax.swing.Icon

import com.intellij.openapi.ui.ValidationInfo
import com.intellij.platform.ProjectTemplate
import darthorimar.intellijcbt.CBT

class CbtProjectTemplate extends ProjectTemplate {
  override def getName: String = "CBT"

  override def getDescription: String =
    """CBT-based Scala project.<br/>
      | More information about CBT can be found <a href="https://github.com/cvogt/cbt">here</a>""".stripMargin

  override def getIcon: Icon = CBT.Icon

  override def createModuleBuilder(): CbtModuleBuilder = new CbtModuleBuilder()

  override def validateSettings(): ValidationInfo = null
}
