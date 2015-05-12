name := """soapconsume"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

seq(cxf.settings : _*)

cxf.wsdls := Seq(cxf.Wsdl(file("wsdls/cxftest2.wsdl"), Nil, None))
