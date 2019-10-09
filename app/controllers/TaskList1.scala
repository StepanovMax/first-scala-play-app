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

  def validateLogin1(username: String, password: String) = Action {
    Ok(s"$username and $password")
  }
}