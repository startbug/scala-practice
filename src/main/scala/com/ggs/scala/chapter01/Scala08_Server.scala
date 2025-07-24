package com.ggs.scala.chapter01

import java.net.ServerSocket

/**
 * @Author starbug
 * @Description
 * @Datetime 2025/4/13 17:43
 */
object Scala08_Server {

  def main(args: Array[String]): Unit = {
    val server = new ServerSocket(19919)
    println("服务器启动成功，等待客服端的链接...")
    val client = server.accept()
    val is = client.getInputStream()
    val result: Int = is.read()
    println("获取客户端发送的数据: " + result)
    is.close()
    client.close()
    server.close()
  }

}
