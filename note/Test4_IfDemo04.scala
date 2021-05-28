package day01

object Test4_IfDemo01{
  def main(args: Array[String]): Unit = {
       /*
          if分支结构  如果
          可选可不选，取决于boolean条件
          if (boolean条件为真){} 如果只作用于1行那么就可以省略{}
   在scala中允许我们的if最后得到的结果可以被变量或者常量接收
          二选一
            if(boolean条件为真){
            }else{
            }
          多条路
          if(boolean条件为真}{
            }else if(boolean条件为真){
            }else if(boolean条件为真){
            }else{
            }
和我们if if 区别在于：如果if else if里面前面的任何一个条件成立，走了，后面的else if或者else都不会走
        */
    val num = 9
   val  num2= if(num==9)
     "这个数是9"
   println(num2)
    if(num==9)
    println(num)
    else if(num==9) //否则如果
      println(s"第二次输出$num")
    else
      println("不满足")

  //改编为if
  if(num==9)
    println(num)
  if(num==9)
    println(s"第二次输出$num")

}

}
