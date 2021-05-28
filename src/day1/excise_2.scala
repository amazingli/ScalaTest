package day1

import scala.io.StdIn

object excise_2 {
  def main(args: Array[String]): Unit = {
    print("输入单价")
    var prize : Double = StdIn.readDouble()
    println()
    print("输入数量")
    var num : Int = StdIn.readInt()
    var total : Double = prize*num
    var money : Double = 0
    println("给钱")
    while(money<total){
      print("再给点:")
      money += StdIn.readDouble()
      print("已经给了"+money+",")
      if (money<total){println("不够钱呐")}
    }
    println("付款成功")
  }
}
