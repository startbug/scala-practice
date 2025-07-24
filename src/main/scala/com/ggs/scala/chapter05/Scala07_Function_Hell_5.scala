package com.ggs.scala.chapter05

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/16 21:50
 */
object Scala07_Function_Hell_5 {

  def main(args: Array[String]): Unit = {
    // 如果函数的名称不重要，那么再传参时，就可以省略函数名称
    def test(f: (Int, Int) => Int): Unit = {
      val result = f(10, 20)
      println(result)
    }

    def sum(x: Int, y: Int): Int = {
      x + y
    }

    test(sum)

    test((x, y) => {
      x - y
    })
  }

}
