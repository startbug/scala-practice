package com.ggs.scala.chapter05

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/16 21:50
 */
object Scala07_Function_Hell_3 {

  def main(args: Array[String]): Unit = {
    def fun(): Unit = {
      println("funnn")
    }

    //    def test(fff: () => Unit): Unit = {
    //      fff()
    //    }
    def test(fff: Function0[Unit]): Unit = {
      fff()
    }

    val ww = fun _
    test(fun)

  }

}
