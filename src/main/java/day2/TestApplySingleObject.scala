package day2

object TestApplySingleObject {
  def apply(parm1 : String, parm2 : String) : String = {
    println("apply method called")
    parm1 + " & " + parm2
  }

  def main(args:Array[String]) {
    // 用括号传递给变量(对象)一个或多个参数时，Scala 会把它转换成对apply方法的调用
    val group: String = TestApplySingleObject("parameter1", "parameter2")
    println(group)
  }
}
