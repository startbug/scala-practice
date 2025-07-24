package com.ggs.scala.chapter04

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/15 22:19
 */
object Scala_04_for_2 {

  def main(args: Array[String]): Unit = {
    var result = for (i <- 1 to 3) yield {
      i
    }
    println(result)
  }

}
