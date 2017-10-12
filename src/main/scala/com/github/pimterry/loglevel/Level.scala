/*
 * Level.scala
 *
 * Updated: Apr 27, 2015
 *
 * Copyright (c) 2015, CodeMettle
 */
package com.github.pimterry.loglevel

import scala.scalajs.js
import scala.scalajs.js.annotation.JSGlobal

/**
 * @author steven
 *
 */
@js.native
trait Level extends js.Object

@JSGlobal("log.levels")
@js.native
object Level extends js.Object {
  def TRACE:  Level = js.native
  def DEBUG:  Level = js.native
  def INFO:   Level = js.native
  def WARN:   Level = js.native
  def ERROR:  Level = js.native
  def SILENT: Level = js.native
}
