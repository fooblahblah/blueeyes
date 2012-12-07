name := "blueeyes-json"

publishArtifact in Test := true

libraryDependencies ++= Seq(
  "org.scalaz"         % "scalaz-core_2.10.0-RC3" % "7.0-SNAPSHOT" changing(),
  "joda-time"          % "joda-time"              % "1.6.2"          % "optional"
)
