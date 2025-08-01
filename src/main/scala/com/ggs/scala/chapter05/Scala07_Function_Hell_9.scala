package com.ggs.scala.chapter05

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/16 21:50
 */
object Scala07_Function_Hell_9 {

  def main(args: Array[String]): Unit = {

    def test(f: String => Unit): Unit = {
      f("zhangsan")
    }

    def fun(name: String): Unit = {
      println("Name" + name)
    }

    //    test(fun)

    test(
      (name: String) => {
        println("Name" + name)
      }
    )

    test(
      (name: String) => println("Name" + name)
    )

    test(
      name => println("Name" + name)
    )
    
    test(println(_))

  }

}
