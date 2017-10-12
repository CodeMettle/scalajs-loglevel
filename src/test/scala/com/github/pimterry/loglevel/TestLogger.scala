package com.github.pimterry.loglevel

import utest._

/**
  * Created by steven on 10/12/2017.
  */
object TestLogger extends TestSuite {
  override val tests = Tests {
    'work - {
      LogLevel.log.setLevel(Level.WARN)
      LogLevel.log.info("a message", "addl", "parms")
    }
  }
}
