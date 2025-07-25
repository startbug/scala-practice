package com.ggs.scala.chapter05

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/16 21:50
 */
object Scala07_Function_Hell_6 {

  def main(args: Array[String]): Unit = {
    // 1.将函数对象作为变量赋值是使用
    // 2.将函数对象作为参数使用
    /*
      java:
      public User test() {
        User user = new User();
        return user;
      }

      User user = test();
      user.yyyy
      user.dddd
     */

    // 3.scala也可以将函数对象作为返回结果返回
    // 函数的返回值类型一般情况下不声明，使用自动推断
    def outer() = {
      def inner(): Unit = {

      }

      inner _
    }

    // 此时，f就是一个函数对象，有函数类型：()=>Unit
    val f = outer()
    // 执行函数对象
    f()
  }

}
