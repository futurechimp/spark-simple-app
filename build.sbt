name := "Spark Simple App"

organization := "com.constructiveproof"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.3"

crossScalaVersions := Seq("2.10.3", "2.11.0-M8")

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.1.RC1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"
)

initialCommands := "import com.constructiveproof.sparksimpleapp._"
