addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.0")
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")
addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.4.2")
addSbtPlugin("com.dwijnand" % "sbt-travisci" % "1.2.0")

// Migration from 2.12.12 to 2.13.4
addSbtPlugin("ch.epfl.scala" % "sbt-scalafix" % "0.9.24")