package day1

import scala.io.StdIn

object Test7 {
  def main(args: Array[String]): Unit = {
    println("请输入一个四位数:")
    var i: Int = StdIn.readInt()
    if (i > 999 && i < 10000) {
      println("千位是:" + i / 1000)
      println("百位是:" + i / 100 % 10)
      println("十位是:" + i % 100 / 10)
      println("个位是:" + i % 10)
    }
  }
}
