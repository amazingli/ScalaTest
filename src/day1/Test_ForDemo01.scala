package day1

object Test_ForDemo01 {
  def main(args: Array[String]): Unit = {
    /*
    for 循环:
    a to b:[a,b]
    a until b:[a,b)
     */
    var i:Int=1
    for(i <- 2 to 4){
      println(i)
    }
    for(i <- 2 until 4){
      println(i)
    }
    var j=0
    for(i<-1 to 3; j<-1 to 3){
      print(i)
      print(j)
    }
  }
}
