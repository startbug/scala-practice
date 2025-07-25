package com.ggs.scala.chapter05

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/16 21:50
 */
object Scala07_Function_Hell_7 {

  def main(args: Array[String]): Unit = {

    //    def outer(): () => Unit = {
    //      def inner(): Unit = {
    //        println("inner...")
    //      }
    //
    //      inner _
    //    }
    //
    //    val f = outer()
    //    f()

    def outer(x: Int) = {

      def mid(f: (Int, Int) => Int) = {

        def inner(y: Int) = {
          f(x, y)
        }

        inner _
      }

      mid _
    }

    val result = outer(1)(_ + _)(3)

    println(result)

  }

}
