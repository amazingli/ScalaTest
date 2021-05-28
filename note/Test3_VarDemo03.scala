package day01

object Test3_VarDemo03 {
  def main(args: Array[String]): Unit = {
    /**
     * 数据类型在scala中分类
     * 基本数据类型（Anyval）：Byte  Short   Int   Long   Float Double  Boolean Char   Unit
     * 引用数据类型（AnyRef）:String
     * 格式化字符串： println(f"  %s   %f  ")
     * 在printf 中 %d表示整数  %s表示字符串  %f表示小数
     **/
    val str = "scala大数据"
    val num = 3.14
    val str2 = "www.baidu.com"
    println(f"字符串为:$str%s,小数为$num%1.3f ") //后面的小数点数字表示位数
    println(s"字符串为:${str},小数为${num}")
    println(s"字符串为:$str,小数为$num")//如果前面带s{}可以省略
    printf("字符串为:str=%s,小数为num=%f", str, num)



  }
}
