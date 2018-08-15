import sbt._

object Dependencies {
  private val spcs2V = "4.3.3"
  lazy val specs2 = "org.specs2" %% "specs2-core" % spcs2V
  lazy val junit = "junit" % "junit" % "4.12" % Test
  lazy val specs2junit = "org.specs2" %% "specs2-junit" % spcs2V
  lazy val specs2html = "org.specs2" %% "specs2-html" % spcs2V
}
