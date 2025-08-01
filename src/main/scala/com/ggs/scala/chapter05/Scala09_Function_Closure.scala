package com.ggs.scala.chapter05

object Scala09_Function_Closure {

  def main(args: Array[String]): Unit = {
    // 函数式编程语言-必报

    // 闭包的实现，不同的scala版本不一致
    // scala在2.12版本前，闭包的使用时匿名函数类实现
    // scala在2.12版本后，必报使用的是改变函数的声明完成的
    def outer(a: Int): (Int) => Int = {
      def inner(b: Int): Int = {
        a + b
      }

      inner _
    }

    val inner = outer(10)
    inner(20)

    val name = "zhangsan"

    def test(): Unit = {
      println(name)
    }

    val f = test _

    f()

    // 总结：闭包的场景
    // 1.内部函数使用了外部的数据，改变数据的生命周期
    // 2.将函数作为对象使用，改变函数本身的生命周期
    // 3.所有匿名函数都有必报
    // 4.内部函数返回到外部使用也会有闭包

  }

}
