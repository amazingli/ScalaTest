package day1
import scala.io.StdIn
import scala.util.Random
import scala.util.control.Breaks.break
object excise_1 {
  def main(args: Array[String]): Unit = {
    //随机生成0-99数猜
    var num = 0
    var point = 100
    var s = 100
    num = Random.nextInt(100)
    while (s != num && point > 0) {
      point = point - 10
      s = StdIn.readInt()
      print(num)
      println("还有"+point+"分")
    }
    if (point > 0) {
      print("恭喜猜中了!")
      println("答案是"+num)
    } else {
      print("GAMEOVER")
      println("答案是"+num)

    }
  }
}
