import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    testOptions in Test += Tests.Argument("html"),
    testOptions in Test += Tests.Argument("console"),
    testOptions in Test += Tests.Argument("pandoc", "false"),
    name := "hello-scala",
    libraryDependencies ++= Seq(specs2, junit, specs2junit, specs2html)
  )
