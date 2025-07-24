package com.ggs.scala.chapter04

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/15 22:08
 */
object Scala04_for {

  def main(args: Array[String]): Unit = {
    val array = 1.to(5);
    val array1 = 1.until(5);
    for (i: Int <- array1) {
      println(i)
    }
  }

}
