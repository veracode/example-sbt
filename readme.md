```sh
$ sbt compile
$ srcclr scan --debug | grep 'Building graph' | sed -n 's/.*\(Building graph.*\)/\1/p'
Building graph using Scala 2.12.4, sbt sbt 1.1.0
```
