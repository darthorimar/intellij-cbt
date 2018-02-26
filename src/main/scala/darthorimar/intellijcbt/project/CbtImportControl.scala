package darthorimar.intellijcbt.project

import com.intellij.openapi.externalSystem.service.settings.AbstractImportFromExternalSystemControl
import com.intellij.openapi.fileChooser.FileChooserDescriptor
import com.intellij.openapi.project.ProjectManager
import darthorimar.intellijcbt.project.settings._
import org.jetbrains.sbt.project.settings.Context

class CbtImportControl
  extends AbstractImportFromExternalSystemControl[CbtProjectSettings, CbtProjectSettingsListener, CbtSystemSettings](
    CbtProjectSystem.Id, CbtSystemSettings.instance(ProjectManager.getInstance.getDefaultProject),
    CbtProjectSettings.default) {

  def getLinkedProjectChooserDescriptor: FileChooserDescriptor =
    new FileChooserDescriptor(true, true, false, false, false, false)

  def onLinkedProjectPathChange(path: String): Unit = {}

  def createProjectSettingsControl(settings: CbtProjectSettings): CbtProjectSettingsControl =
    new CbtProjectSettingsControl(Context.Wizard, settings)

  def createSystemSettingsControl(settings: CbtSystemSettings): CbtSystemSettingsControl =
    new CbtSystemSettingsControl(settings)
}
