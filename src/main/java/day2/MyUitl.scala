package day2

class MyUitl {
  def printMsg(msg:String)=println(msg)
}
trait MyTrait extends MyUitl{
  def log(msg:String):Unit={
    printMsg("log:: "+msg)
  }
}
class Demo(val name:String) extends  MyTrait
{
  def sayHello:Unit={
    log(name+"0000")
    printMsg(name+"111")
  }
}
object  testz{
  def main(args: Array[String]): Unit = {
    val a =new Demo("A")
    a.sayHello
  }
}