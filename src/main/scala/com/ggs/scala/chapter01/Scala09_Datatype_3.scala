package com.ggs.scala.chapter01

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/13 22:18
 */
object Scala09_Datatype_3 {

  def main(args: Array[String]): Unit = {
    val c: Char = ('A' + 1)
    println(c)
    var cc = this.+("hhha");
    println(cc)
  }

  def myTest(name: String): String = {
    return "haha" + name;
  }

  def +(sss: String): String = {
    return sss+"wawawa";
  }

}
