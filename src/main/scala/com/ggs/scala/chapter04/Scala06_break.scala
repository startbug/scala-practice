package com.ggs.scala.chapter04

import scala.util.control.Breaks

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/15 22:28
 */
object Scala06_break {

  def main(args: Array[String]): Unit = {
    Breaks.breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          Breaks.break()
        }
        println("i=" + i)
      }
    }
  }

}
