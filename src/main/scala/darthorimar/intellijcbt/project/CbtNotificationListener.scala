package darthorimar.intellijcbt.project

import com.intellij.notification.{Notification, NotificationType, Notifications}
import com.intellij.openapi.externalSystem.model.ExternalSystemException
import com.intellij.openapi.externalSystem.model.task.{ExternalSystemTaskId, ExternalSystemTaskNotificationListenerAdapter}
import darthorimar.intellijcbt.project.structure.CbtProjectImporingException

class CbtNotificationListener extends ExternalSystemTaskNotificationListenerAdapter {
  override def onFailure(id: ExternalSystemTaskId, e: Exception): Unit = {
    if (id.getProjectSystemId == CbtProjectSystem.Id) {
      val title = "CBT project importing failure"

      def getMessage(e: Throwable): String = e match {
        case ex: ExternalSystemException =>
          getMessage(ex.getCause)
        case importEx: CbtProjectImporingException =>
          importEx.getMessage
        case ex: Exception =>
          s"Unknown error ocurred:\n ${ex.getMessage}"
      }

      Notifications.Bus.notify(new Notification(title, title, getMessage(e), NotificationType.ERROR))
    }
  }
}
