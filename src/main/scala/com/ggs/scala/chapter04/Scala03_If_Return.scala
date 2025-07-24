package com.ggs.scala.chapter04

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/15 22:11
 */
object Scala03_If_Return {

  def main(args: Array[String]): Unit = {
    val name : String = "lucy"
    val value = if (name == "lucy") {
      100;
    } else {
      "hhhei"
    }
    println(value)
  }

}
