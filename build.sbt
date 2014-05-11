name := "Spark Simple App"

organization := "com.constructiveproof"

version := "1.0"

scalaVersion := "2.10.3"

crossScalaVersions := Seq("2.10.3", "2.11.0-M8")

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "0.9.1",
  "org.scalatest" %% "scalatest" % "2.1.RC1" % "test",
  "org.scalacheck" %% "scalacheck" % "1.11.3" % "test"
)

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

initialCommands := "import com.constructiveproof.sparksimpleapp._"
