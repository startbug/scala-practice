package com.ggs.scala.chapter01

import java.io.FileOutputStream
import scala.io.{BufferedSource, Source}

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/13 17:37
 */
object Scala07_IO {

  def main(args: Array[String]): Unit = {
    val source: BufferedSource = Source.fromFile("D:\\workspace\\backend\\scala\\scala-practice-demo\\data\\word.txt")
    val iter: Iterator[String] = source.getLines()
    while (iter.hasNext) {
      println(iter.next())
    }
    source.close();

    val fos = new FileOutputStream("D:\\workspace\\backend\\scala\\scala-practice-demo\\data\\word.txt")
    fos.write("hhhh".getBytes)
    fos.write("eeee".getBytes)
    fos.close()
  }

}
