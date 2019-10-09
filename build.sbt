name := """scala-example"""
organization := "com.stepanovmax"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.0"

libraryDependencies += jdbc
libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.41"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.stepanovmax.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.stepanovmax.binders._"