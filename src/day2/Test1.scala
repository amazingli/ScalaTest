package day2

import scala.util.control._

object Test1 {
  def main(args: Array[String]): Unit = {
    val loop = new Breaks
    loop.breakable{
      for(i<-1 to 100){
        println(i)
        if (i==50)
          loop.break
      }

    }
    println("????")
  }
}
