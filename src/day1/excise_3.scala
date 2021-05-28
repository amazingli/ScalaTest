package day1

object excise_3 {
  def main(args: Array[String]): Unit = {
    //x+y=200
    //4x+2y=620
    println("鸡和兔子一共200只,一共620只脚,多少鸡多少兔子")
    var num1=200//鸡
    var num2 = 0//兔子
    while ((num1*2+num2*4)!=620){
      num1 -=1
      num2 +=1
    }
    println(num1+" "+num2)
  }
}
