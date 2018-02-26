package darthorimar.intellijcbt.project.settings

import com.intellij.openapi.components.ServiceManager
import com.intellij.openapi.externalSystem.settings.AbstractExternalSystemLocalSettings
import com.intellij.openapi.project.Project
import darthorimar.intellijcbt.project.CbtProjectSystem

class CbtLocalSettings(project: Project)
  extends AbstractExternalSystemLocalSettings(CbtProjectSystem.Id, project)

object CbtLocalSettings {
  def getInstance(project: Project): CbtLocalSettings =
    ServiceManager.getService(project, classOf[CbtLocalSettings])
}