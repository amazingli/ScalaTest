package day1

import scala.io.StdIn

object excise_6 {
  def main(args: Array[String]): Unit = {
    println("判断奇数偶数")
    var i :Int =StdIn.readInt()
    if (i%2==0){
      println("偶数")
    }else{
      println("奇数")
    }
  }
}
