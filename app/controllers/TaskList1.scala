package controllers

import javax.inject._

import play.api.mvc._
import play.api.i18n._

@Singleton
class TaskList1 @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  val tasks = List("Task 1", "Task 2", "Task 3", "Sleep", "Video")

  def taskList = Action {
    Ok(views.html.taskList1(tasks))
  }

  def login1() = Action {
    Ok(views.html.login1())
  }

  def validateGET1(username: String, password: String) = Action {
    Ok(s"$username and $password")
  }

  def validatePOST1() = Action {
    request =>
      var postVals = request.body.asFormUrlEncoded
      postVals.map {
        args =>
          val username = args("username").head
          val password = args("password").head
          Redirect(routes.TaskList1.taskList())
      }.getOrElse(Redirect(routes.TaskList1.login1()))
  }
}