lazy val challenges =
  project
    .in(file("."))
    .settings(name := "Scala Challenges")
    .settings(settings)
    .settings(
      libraryDependencies ++= Seq(
          library.specs2 % Test
        )
    )

// *****************************************************************************
// Library dependencies
// *****************************************************************************

lazy val library =
  new {

    object Version {
      val specs2 = "4.8.3"
    }

    val specs2 = "org.specs2" %% "specs2-core" % Version.specs2
  }

// *****************************************************************************
// Settings
// *****************************************************************************

lazy val settings =
  commonSettings ++
  coverageSettings ++
  scalafmtSettings

lazy val commonSettings =
  Seq(
    // scalaVersion from .travis.yml via sbt-travisci
    // scalaVersion := "2.12.9",
    version := "1.0.0-SNAPSHOT",
    organization := "com.codingmaniacs.challenges",
    scalacOptions ++= Seq(
        "-deprecation",
        "-encoding",
        "UTF-8",
        "-feature",
        "-language:existentials",
        "-language:higherKinds",
        "-language:implicitConversions",
        "-language:postfixOps",
        "-target:jvm-1.8",
        "-unchecked",
        "-Xfatal-warnings",
        "-Xlint",
        "-Xsource:2.13.4",
        "-Ywarn-dead-code",
        "-Ywarn-numeric-widen",
        "-Wunused:imports,params",
        "-Ywarn-value-discard"
      ),
    parallelExecution.in(Test) := false,
    unmanagedSourceDirectories.in(Compile) := Seq(scalaSource.in(Compile).value),
    unmanagedSourceDirectories.in(Test) := Seq(scalaSource.in(Test).value),
    logBuffered in Test := false,
    publishArtifact in Test := false
  )

lazy val coverageSettings =
  Seq(
    coverageEnabled := true,
    coverageMinimum := 90,
    coverageFailOnMinimum := true,
    coverageHighlighting := true
  )

lazy val scalafmtSettings =
  Seq(
    scalafmtOnCompile := true
  )
