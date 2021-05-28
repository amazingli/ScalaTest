package day1

import scala.io.StdIn
import scala.util.control.Breaks.break

object excise_7 {
  def main(args: Array[String]): Unit = {
    //输出1+2+3...+n=?
    println("输入一个数")
    val n:Int = StdIn.readInt()
    var s:Int = 0
//    for(i <-1 to n){
//      s +=i
//      if (i==n){printf("%d=%d",i,s)
//      }else
//        printf("%d+",i)
//
    var i :Int=1
    while (i<=n){
      s+=i
      if (i==n){
        printf("%d=%d/t",i,s)
        println(i+"="+s)
      }else {

        printf("%d+",i)
      }
      i+=1
    }
  }
}
