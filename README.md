# scalajs-loglevel

Scala.js façade for https://github.com/pimterry/loglevel

### Usage:

```
libraryDependencies += "com.codemettle.scalajs" %%% "loglevel" % "1.0.0"
```

```scala
import com.github.pimterry.loglevel.LogLevel

object Test {
  private val logger = LogLevel.log

  logger.debug("log message")
}
```
