package com.ggs.scala.chapter05

import scala.util.control.Breaks._

object Scala08_Function_Abstract {

  def main(args: Array[String]): Unit = {
    // 函数式编程语言-控制抽象
    // 抽象：不完整
    // 抽象类：不完整的类
    // 抽象方法：不完整的方法
    def test(f: () => Unit): Unit = {
      f()
    }

    // 函数类型只有返回，没有输入的场合，称之为抽象，因为不完整
    // 调用时，不能有小括号
    // 在传值的时候，需要进行控制
    def test1(f: => Unit): Unit = {
      f
    }

    //    test(
    //      () => {
    //        println("嘿嘿嘿嘿")
    //      }
    //    )

    // 完整的参数传递，是将函数对象作为参数传递
    // 所谓的控制抽象，其实就是将代码作为参数进行传递
    // 自定义语法时，可以采用控制抽象，因为代码可以传递，也就意味着逻辑是变化的
    //    test1(
    //      println("嘿嘿嘿嘿")
    //    )

    // 循环终端的代码就体现了控制抽象
    breakable {
      for (i <- 1 to 5) {
        if (i == 3) {
          break
        }
        println("i = " + i)
      }
    }

  }

}
