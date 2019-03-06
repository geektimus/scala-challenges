name := "Scala Challenges"

organization := "com.codingmaniacs.challenges"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.8"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

scalacOptions in (Compile, doc) ++= Seq("-unchecked", "-deprecation", "-diagrams", "-implicits", "-skip-packages", "samples")

libraryDependencies += "org.specs2" %% "specs2-core" % "4.4.1" % Test

logBuffered in Test := false

coverageMinimum := 90
coverageFailOnMinimum := true
coverageHighlighting := true

publishArtifact in Test := false
parallelExecution in Test := false