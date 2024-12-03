ThisBuild / scalaVersion := "3.5.0"

enablePlugins(ProtocPlugin)

import sbtprotoc.ProtocPlugin.autoImport._

libraryDependencies ++= Seq(
  "io.grpc" % "grpc-netty" % "1.58.0",
  "io.grpc" % "grpc-protobuf" % "1.58.0",
  "io.grpc" % "grpc-stub" % "1.58.0",
  "com.google.protobuf" % "protobuf-java" % "3.24.0"
)

Compile / PB.targets := Seq(
  PB.gens.java -> (Compile / sourceManaged).value / "protobuf"
)

Compile / PB.protoSources := Seq(
  baseDirectory.value / "src" / "main" / "protobuf"
)
