package com.ggs.scala.chapter05

object Scala07_Function_Hell_5_Test {

  def main(args: Array[String]): Unit = {

    // 计算器
    def calc(a: Int, f: (Int, Int) => Int, b: Int): Int = {
      f(a, b)
    }

    def +(x: Int, y: Int): Int = {
      x + y
    }

    def -(x: Int, y: Int): Int = {
      x - y
    }

    val result = calc(1, -, 3)
    println(result)

    val result1 = calc(1, _ + _, 3)
    println(result1)

  }

}
