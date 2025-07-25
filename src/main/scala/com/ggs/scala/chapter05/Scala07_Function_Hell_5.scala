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

    println("================================================================")
    test(sum)

    println("================================================================")
    // 1.匿名函数的逻辑代码只有一行，大括号可以省略
    test((x: Int, y: Int) => x + y)

    println("================================================================")
    // 2.匿名函数的参数类型如果可以退端出来，那么参数类型可以省略
    test(
      (x, y) => x + y
    )

    println("================================================================")

    // 3.匿名函数中，如果参数列表的个数只有一个，那么小括号可以省略
    // 4.匿名函数中，如果参数按照顺序只执行一次的场合，那么可以使用下划线代替参数，省略参数列表和箭头
    test(_ + _)
    test(_.+(_))
    // 这里的第一个下划线就表示一个参数，以此类推，数值表示任意

    println("================================================================")

    def fun(f: (String) => Unit): Unit = {
      f("zhangsan")
    }

    def test_fun(name: String): Unit = {
      println(name)
    }

    fun(test_fun);

    fun((name: String) => {
      println(name)
    })

    fun(
      (name: String) => println(name)
    )

    fun(
      (name) => println(name)
    )

    fun(
      name => println(name)
    )

    fun(
      println(_)
    )

  }

}
