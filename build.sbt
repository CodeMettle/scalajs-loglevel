import com.typesafe.sbt.pgp.PgpKeys.publishSigned
import sbtrelease.ReleasePlugin.ReleaseKeys.publishArtifactsAction
import xerial.sbt.Sonatype.SonatypeKeys.profileName

enablePlugins(ScalaJSPlugin)

organization := "com.codemettle.scalajs"

name := "loglevel"

description := "Scala.js façade for loglevel"

startYear := Some(2015)

homepage := Some(url("https://github.com/CodeMettle/scalajs-loglevel"))

organizationName := "CodeMettle, LLC"

organizationHomepage := Some(url("http://www.codemettle.com"))

licenses += ("MIT License" → url("http://opensource.org/licenses/MIT"))

scalaVersion := "2.11.6"

scalacOptions := Seq("-Xlint", "-unchecked", "-deprecation", "-feature")

persistLauncher in Compile := true

persistLauncher in Test := false

val jsCompileDependencies = Seq(
    "org.webjars" % "loglevel" % "1.1.0" / "loglevel.min.js"
)

jsDependencies := jsCompileDependencies

// Publish / Release

releaseSettings

publishArtifactsAction := publishSigned.value

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

sonatypeSettings

profileName := "com.codemettle"
