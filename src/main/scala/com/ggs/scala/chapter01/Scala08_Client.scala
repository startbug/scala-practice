package com.ggs.scala.chapter01

import java.io.OutputStream
import java.net.Socket

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/13 17:43
 */
object Scala08_Client {
  def main(args: Array[String]): Unit = {
    val server = new Socket("127.0.0.1", 19919)
    println("连接服务器陈工，向服务器发送数据")
    val os: OutputStream = server.getOutputStream
    os.write(100)
    println("向服务器发送数据: 100")
    os.close()
    server.close()
  }
}
