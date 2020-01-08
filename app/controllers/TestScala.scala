package controllers

import javax.inject._

import play.api.mvc._
import play.api.i18n._
import models.TaskListInMemoryModel

@Singleton
class TestScala @Inject()(cc: ControllerComponents) extends AbstractController(cc) {
  val word = "Task 1"
  val wordsList = List("Task 1", "Task 2", "Task 3", "Sleep", "Video")

  def echoWord(arg: String) =
    println(arg)

  val words = echoWord(word)

  def testscala() = Action {
    Ok(views.html.testscala(word))
  }

  // def testscala = Action { implicit request =>
  //   Ok("Got request [" + request + "]")
  // }

}