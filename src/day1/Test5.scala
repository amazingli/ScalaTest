package day1

import scala.io.StdIn

object Test5 {
  def main(args: Array[String]): Unit = {
    //提示用户输入字符串,整数,小数
    println("请输入你的名字:")
    //java new Scanner(System.in).next()
    //js prompt
    var name = StdIn.readLine()
    //StdIn
    println(name)
    println("请输入年龄")
    var age : Int =  StdIn.readInt()//获取整数
    println("你的年龄:"+age)
    println("你的身高")
    var high : Double = StdIn.readDouble()
    println("你的身高是:"+high)
  }
}
