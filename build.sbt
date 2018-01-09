name := "example-sbt"

version := "1.0"

crossScalaVersions := Seq("2.10.7", "2.11.8", "2.12.4")

libraryDependencies += "org.mindrot" % "jbcrypt" % "0.3m"

libraryDependencies ++= { scalaBinaryVersion (sv => Seq(liftweb(sv))).value }

def liftweb(v: String) =
  "net.liftweb" %% "lift-webkit" % (v match {
    case "2.10" => "3.0-M1"
    case "2.11" | "2.12"  => "3.2.0-M3"
    case _ => sys.error(s"unrecognized binary version $v")
  })
