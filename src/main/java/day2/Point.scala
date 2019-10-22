package day2

class Point {
  private var _x = 0
  private var _y = 0
  private val bound = 100

  //getter 方法
  def x = _x
  //setter 方法
  def x_= (newValue:Int): Unit={
  if (newValue < bound) _x=newValue
  else printWaring("x")
  }
  //getter方法
  def y= _y
  //setter方法
  def y_= (newValue1:Int):Unit = {
    if (newValue1 < bound) _y = newValue1
    else printWaring("y")
  }
  def printWaring(str: String) :Unit={
    println(s"$str:out of bound")
  }
}
object day02Test03
{
  def main(args: Array[String]): Unit = {
    val p1=new Point
    print(p1.x,p1.y)
//    p1.x=66
//    p1.y=777
//    print(p1.x,p1.y)
      p1.x_=(66)
    p1.y_=(99)
    print(p1.x,p1.y)

  }
}
