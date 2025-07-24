package com.ggs.scala.chapter04

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/15 22:08
 */
object Scala04_for_1 {

  def main(args: Array[String]): Unit = {
    val array = 1.to(5);
    for (i: Int <- array if i <= 3) {
      println(i)
    }

    val array1 = 1.to(5).by(2);
    for (i: Int <- array1) {
      println(i)
    }

    for (i <- 1 to 3) {
      for (k <- 1 to 3) {
        print(i + "_" + k)
      }
    }

    for (i <- Range(1, 4); j <- Range(1, 4)) {
      println(i + "_" + j)
    }

  }

}
