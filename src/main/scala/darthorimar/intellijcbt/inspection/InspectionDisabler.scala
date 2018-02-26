package darthorimar.intellijcbt.inspection

import com.intellij.codeInspection.InspectionProfileEntry
import com.intellij.psi.PsiElement
import darthorimar.intellijcbt._
import org.jetbrains.plugins.scala.util.IntentionAvailabilityChecker

class InspectionDisabler extends IntentionAvailabilityChecker {

  override def canCheck(psiElement: PsiElement): Boolean = {
    val project = psiElement.getProject
    project.isCbtProject
  }

  override def isInspectionAvailable(inspection: InspectionProfileEntry,
                                     psiElement: PsiElement): Boolean =
    inspection.getShortName match {
      case "ScalaPackageName" => false
      case "ScalaFileName" =>
        val file = psiElement.getContainingFile
        file.getName.toLowerCase != "build.scala" ||
          file.getParent.getName.toLowerCase != "build"
      case _ => true
    }
}
