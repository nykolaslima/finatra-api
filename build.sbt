name := "finatra-api"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.10.6"

libraryDependencies ++= Seq(
  "com.twitter" %% "finatra" % "1.6.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4"
)

resolvers +=
  "Twitter" at "http://maven.twttr.com"