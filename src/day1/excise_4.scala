package day1

object excise_4 {
  def main(args: Array[String]): Unit = {
    println("一百块钱买一百只鸡,大鸡5块,中鸡3块,小鸡1/3块,几种买法")
    var i = 0
    var j = 0
    var k =0
    for (i<-0 to 20){
      for(j<-0 to 34){
        k = 100-i-j
        if (k%3==0 && (5*i+3*j+k/3==100)) {
          println(i+" "+j+" "+k)
        }
      }
    }
  }
}
