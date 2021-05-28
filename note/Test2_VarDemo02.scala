package day01

object Test2_VarDemo02 {
  def main(args: Array[String]): Unit = {
    /**
     * 命名规则
     *
     * Scala中的标识符声明，基本和Java是一致的，但是细节上会有所变化，有以下三种规则：
     * （1）以字母或者下划线开头，后接字母、数字、下划线
     * （2）以操作符开头，且只包含操作符（+ - * / # !等）
     * （3）用反引号....包括的任意字符串，即使是Scala关键字（39个）也可以
     * • package, import, class, object, trait, extends, with, type, for
     * • private, protected, abstract, sealed, final, implicit, lazy, override
     * • try, catch, finally, throw
     * • if, else, match, case, do, while, for, return, yield
     * • def, val, var
     * • this, super
     * • new
     * • true, false, null

     */
    var #!*/%&* = 5 //标点符号可以连在一起写，只允许是标点符号组成
     var `3` = 9
    print(`3`)
    print(#!*/%&*)
    var str = "zs"
    var num = 78
    var `var` = 79
    printf("str=%s num=%d",str,num)
    println()
//    print("str=%s num=%d",str,num)
    //printf表示打印模板 %s表示打印字符串  %d表示打印整数
    println(s"str=${str},num=${num}")
//s表示字符串，我们如果要获取里面值${str}


  }

}
