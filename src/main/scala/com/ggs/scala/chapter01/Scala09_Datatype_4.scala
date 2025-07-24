package com.ggs.scala.chapter01

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/13 22:18
 */
object Scala09_Datatype_4 {

  def main(args: Array[String]): Unit = {
    val name1: String = null
    val name2 = "123";

    val name3 = new String("123")
    val name4 = new String("123")

    //    println(name1 == name4)
    //    println(name1.equals(name4))

    println(name3 == name4)
    println(name3 eq name4)
  }

}
