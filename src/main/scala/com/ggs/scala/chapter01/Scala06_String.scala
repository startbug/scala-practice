package com.ggs.scala.chapter01

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/13 17:25
 */
object Scala06_String {

  def main(args: Array[String]): Unit = {
    val name: String = "abc";
    println(name)

    val myTest: String =
      """
        | test
        | hello
        |""".stripMargin
    println(myTest)
  }

}
