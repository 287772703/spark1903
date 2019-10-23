package day2

trait Logger {
def log(msg:String)
}
trait ConsoleLogger{
  def log(msg: String):Unit=println(msg)
}
class  Account{
  protected var balance =888
}
class SavaAccount extends  Account with ConsoleLogger{
  def  withdrow(amount:Int):Unit={
    if(amount>balance)log("余额不足")
    else  balance -=amount
  }
}
object day02Test10{
  def main(args: Array[String]): Unit = {
    val sal=new SavaAccount
    sal.withdrow(1700)
  }
}