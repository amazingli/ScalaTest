package day01

object Test1_VarDemo01 {
  def main(args: Array[String]): Unit = {
    /**
     * 1）基本语法
     * ​ var 变量名 [: 变量类型] = 初始值 var i:Int = 10
     * ​ val 常量名 [: 常量类型] = 初始值 val j:Int = 20
     * ​ 注意：能用常量的地方不用变量
     * 2）变量声明必须要有初始值
     *    var r,t=9      int a,b=9;在java中只声明了a并没有初始化
     * 3） val是声明常量的，意味着值不可以变，var声明变量的，值可以变
     */
    var  a : Int = 4//声明变量时，类型可以省略，编译器自动推导，即类型推导
    val  b : Int =20 //类型确定后，就不能修改，说明Scala是强数据类型语言
//    b=90 错误，因为是常量
    var  t,c = 45  //可以，同时声明两个变量并且同时初始化，和我们java不一样
    val d = 9
    print(d)
//    d=5 错误val是声明常量的
    val student = new Students()//常量：引用数据类型，地址不改，里面的值可以改
    student.age = 19  //说明age是var变量
    student.name = "zs"//说明name是var变量
//   student.string ="ws"//说明string是val常量
//    student.high = 90//说明high是val常量
    student.person.id=8;



  }

}
