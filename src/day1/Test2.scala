package day1

object Test2 {
  def main(args: Array[String]): Unit = {
    /**
     * 1.基本语法
     *  var 变量名 [: 变量数据类型]  = 初始值 ;
     *  val 常量名 [: 常量数据类型]  = 初始值 ;
     * 2.变量声明必须要有初始值.
     * 3.val 用于声明常量, var 用于声明变量
     * 4.命名规则
     *    scala中标识符声明跟java一样,但也有区别:
     *      1)字母或者_开头接 字母,数字,_
     *      2)操作符开头,且只包含操作符( + - * / # !)
     *      3)用``反引号包裹任意字符
     * 5.引用数据类型AnyRef: String;
     *   基本数据类型AnyVal: Byte, Short ,Int , Long, Float, Double, Unit, Boolean, Char, Null;
     * 6.格式化字符串
     *  printf %d:整数 %f:浮点数 %s:字符串
     */
    var c, d = 39 // 同时声明
    var e: Int = 34;
    var f: Byte = 3;
    var fl:Double = 12.3
    var s: String = "今天天气很好"
    printf("今天天气怎样,%s,今天气温%d",s, e)
    println(f"%%f",fl)
  }
}
