name := "blueeyes-mongo"

fork := true

libraryDependencies ++= Seq(
  "org.mockito"                 % "mockito-all"              % "1.9.0"          % "test",
  "org.mongodb"                 % "mongo-java-driver"        % "2.9.1",
  "com.google.guava"            %  "guava"                   % "12.0",
  "commons-io"                  %  "commons-io"              % "2.4",
  "org.scalaz"                  % "scalaz-effect_2.10.0-RC3" % "7.0-SNAPSHOT" changing()
)

parallelExecution in Test := false
