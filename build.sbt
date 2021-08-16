import Dependencies._

ThisBuild / scalaVersion     := "2.13.6"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "json parsing",
    libraryDependencies += scalaTest % Test
  )
libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "3.3.1"

val circeVersion = "0.14.1"
libraryDependencies += "org.typelevel" %% "cats-core" % "2.6.1"
libraryDependencies ++= Seq(
  "io.circe" %% "circe-core",
  "io.circe" %% "circe-generic",
  "io.circe" %% "circe-parser"
).map(_ % circeVersion)
// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.


