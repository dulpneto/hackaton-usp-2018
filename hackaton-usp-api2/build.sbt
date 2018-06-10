name := """hackaton-usp-api"""
organization := "com.usp"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"

libraryDependencies ++= Seq(
  guice,
  "org.mongodb.morphia" % "morphia" % "1.2.1"
)
