package darthorimar.intellijcbt.project.template

import com.intellij.openapi.externalSystem.model.DataNode
import com.intellij.openapi.externalSystem.model.project.ProjectData
import darthorimar.intellijcbt.project.model.{CbtProjectConverter, CbtProjectInfo}
import darthorimar.intellijcbt.project.settings.CbtExecutionSettings

import scala.util.{Success, Try}
import scala.xml.Node

object CbtProjectImporter {
  def importProject(buildInfo: Node, settings: CbtExecutionSettings): Try[DataNode[ProjectData]] =
    Success(CbtProjectInfo(buildInfo))
      .flatMap(CbtProjectConverter(_, settings))
}
