package com.ggs.scala.chapter05

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/16 21:50
 */
object Scala07_Function_Hell_8 {

  def main(args: Array[String]): Unit = {

    // 如果一个函数使用了外部的变量，但是改变这个变量的生命周期
    // 将这个变量包含到当前函数的作用域内，形成闭合的效果（环境），这个环境称之为闭包环境
    // 简称【闭包】

    def outer(x: Int) = {
      def inner(y: Int) = {
        x + y
      }

      inner _
    }

    val inner = outer(10)
    val result = inner(20)
    println(result)

  }

}
