package day2

class Student2 {
private var age =10
  def isOld(other:Student2):Int=if (age>other.age) 1 else 0
}
class Hello
{
  println("组构造器 starting")
  private[this] var  name="tom"
  def say:Unit = {
    println(s"hello,$name,are you ok")
  }
  println("组构造器ending")
}
object day02Test02
{
  def main(args: Array[String]): Unit = {
    val h1=new Hello
    println("*"*10)
    h1.say
  }
}

