name := "Scala Challenges"

organization := "com.codingmaniacs.challenges"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.4"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

logBuffered in Test := false