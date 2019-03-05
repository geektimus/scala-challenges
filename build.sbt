name := "Scala Challenges"

organization := "com.codingmaniacs.challenges"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.8"

//libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.6"
libraryDependencies += "org.specs2" %% "specs2-core" % "4.4.1" % Test

logBuffered in Test := false

parallelExecution in ThisBuild := false