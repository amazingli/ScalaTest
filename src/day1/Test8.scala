package day1

import scala.io.Source

object Test8 {
  def main(args: Array[String]): Unit = {
    val s =Source.fromFile("src//day1//test.txt")
    for (a <- s.getLines()){
      println(a)
    }
    s.close
  }
}
