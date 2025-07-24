package com.ggs.scala.chapter05

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/16 21:50
 */
object Scala07_Function_Hell_4 {

  def main(args: Array[String]): Unit = {
    def sum(x: Int, y: Int): Int = {
      x + y
    }

    def test(f: (Int, Int) => Int): Unit = {
      val result = f(10, 20)
      println(result)
    }

    val i: Int = sum(10, 20)
    println(i)

    // 将函数对象作为参数使用，就类似于将逻辑进行传递，意味着逻辑可以不用写死
    test(sum)

  }

}
