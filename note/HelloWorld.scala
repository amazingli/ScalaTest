package day01
//包   包名
//main 方法名
//小括号表示参数列表
//  参数声明方式: java  ->  类型  参数名  int a
//                      scala ->  参数名 : 类型   a : Int
//  public修饰符:  scala中没有public关键字,如果不声明访问权限,那么就是公共的 java中default
//  static修饰符:  scala中没有静态方法,所以没有static关键字。纯面向对象语言
//  void关键字:  表示返回值,但是不遵守面向对象语法,所以scala中没有,但是Unit类型,表示没有返回值
//  scala中: 方法名(参数列表):返回值类型
//  scala中方法必须采用关键字def声明
//  scala中方法实现赋值给方法声明,所以中间需要等号连接

//  scala是一个完全面向对象的语言,所以没有静态语法,为了能调用静态语法(模仿静态语法)
//  采用伴生对象单例的方式调用方法


/*
* Scala 完全面向对象,故scala去掉了Java中非面向对象的元素,如static关键字,void类型
* 1) static
*     scala无static关键字,由object实现类似静态方法的功能(类名.方法名)
*     class关键字和Java中的class关键字作用相同,用来定义一个类
* 2) void
*     对于无返回值的函数,scala定义其返回值类型为Unit类型
*
* */

object HelloWorld {
  //对象    对象名
  def main (args : Array [String] ) :Unit ={
    // 声明   main方法   参数     数组   返回值（为空和void类似）
     print("今天是学习Scala的第一天")
    //不换行输出： 今天是学习Scala的第一天
      println("我今天很开心")
    //换行输出： 我今天很开心
    val    string  =hello("我是张三风")
    println(string)
  }
  def hello (string: String ) :   String ={


    return  string
  }

}
