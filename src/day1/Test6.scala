package day1

import scala.io.StdIn

object Test6 {
  def main(args: Array[String]): Unit = {
    println("输入商品单价:")
    var prize : Float = StdIn.readFloat()
    println("输入商品数量:")
    var num : Int = StdIn.readInt()
    var total : Float = num * prize
    println("商品总价是:"+total+"元")
    println(s"商品总价是:${num}元")
    //字符串前加s ${变量名}
  }
}
