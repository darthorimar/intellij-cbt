package darthorimar.intellijcbt.project.template

import java.io.File

import com.intellij.openapi.project.Project
import darthorimar.intellijcbt.process.CbtProcess

import scala.util.Try

class Giter8CbtTemplate(template: String) extends CbtTemplate {
  override def generate(project: Project, root: File, settings: CbtTemplateSettings): Try[String] =
    CbtProcess.generateGiter8Template(template, project, root)

  override def name: String = s"Giter8 template '$template'"
}
