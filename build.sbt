import sbt.Keys._

enablePlugins(ScalaJSPlugin)

organization := "com.codemettle.scalajs"

name := "loglevel"

description := "Scala.js façade for loglevel"

startYear := Some(2015)

homepage := Some(url("https://github.com/CodeMettle/scalajs-loglevel"))

organizationName := "CodeMettle, LLC"

organizationHomepage := Some(url("http://www.codemettle.com"))

licenses += ("MIT License" → url("http://opensource.org/licenses/MIT"))

crossScalaVersions := Seq("2.11.11", "2.12.3")

scalaVersion := crossScalaVersions.value.last

scalacOptions := Seq("-Xlint", "-unchecked", "-deprecation", "-feature")

scalacOptions += {
  CrossVersion partialVersion scalaVersion.value match {
    case Some((x, y)) if x >= 2 && y >= 12 ⇒ "-target:jvm-1.8"
    case _ ⇒ "-target:jvm-1.6"
  }
}

val jsCompileDependencies = Seq(
  "org.webjars" % "loglevel" % "1.1.0" / "loglevel.min.js"
)

jsDependencies := jsCompileDependencies

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.5.4" % Test
testFrameworks += new TestFramework("utest.runner.Framework")
requiresDOM in Test := true

// Publish / Release

releasePublishArtifactsAction := PgpKeys.publishSigned.value

scmInfo := Some(
  ScmInfo(url("https://github.com/CodeMettle/scalajs-loglevel"),
    "scm:git:git@github.com:CodeMettle/scalajs-loglevel.git",
    Some("scm:git:git@github.com:CodeMettle/scalajs-loglevel.git")))

pomExtra := {
  <developers>
    <developer>
      <name>Steven Scott</name>
      <email>steven@codemettle.com</email>
      <url>https://github.com/codingismy11to7</url>
    </developer>
  </developers>
}

publishMavenStyle := true

releaseCrossBuild := true

sonatypeProfileName := "com.codemettle"
