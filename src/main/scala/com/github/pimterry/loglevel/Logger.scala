package com.github.pimterry.loglevel

import scala.scalajs.js

/**
 * @author steven
 *
 */
trait Logger extends js.Object {
  def trace(msg: Any, addl: Any*): Unit = js.native
  def debug(msg: Any, addl: Any*): Unit = js.native
  def info(msg: Any, addl: Any*): Unit = js.native
  def warn(msg: Any, addl: Any*): Unit = js.native
  def error(msg: Any, addl: Any*): Unit = js.native

  def setLevel(level: Level): Unit = js.native
  def setLevel(level: String): Unit = js.native

  def enableAll(): Unit = js.native
  def disableAll(): Unit = js.native
}
