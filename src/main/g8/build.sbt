import android.Keys._

android.Plugin.androidBuild

name := "hello-scaloid-sbt"

scalaVersion := "2.10.3"

proguardOptions in Android ++= Seq("-dontobfuscate", "-dontoptimize")

libraryDependencies += "org.scaloid" %% "scaloid" % "3.0-8"

scalacOptions in Compile += "-feature"

run <<= run in Android

install <<= install in Android
