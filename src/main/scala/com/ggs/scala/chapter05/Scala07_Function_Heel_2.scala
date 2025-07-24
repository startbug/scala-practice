package com.ggs.scala.chapter05

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/16 21:44
 */
object Scala07_Function_Heel_2 {

  def main(args: Array[String]): Unit = {

    def test(): Unit = {
      println("sss")
    }

    val f = test _
    println(f)
    f()
  }

}
