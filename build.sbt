name := "Scala Challenges"

organization := "com.codingmaniacs.challenges"

version := "1.0.0-SNAPSHOT"

scalaVersion := "2.12.4"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.4"
libraryDependencies += "org.specs2" %% "specs2-core" % "4.0.3" % Test

logBuffered in Test := false

resolvers += "Artima Maven Repository" at "http://repo.artima.com/releases"

parallelExecution in ThisBuild := false