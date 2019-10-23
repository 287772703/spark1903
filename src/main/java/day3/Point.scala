package day3
//求两点之间的乘积
import scala.math.{pow,sqrt}
case class Point(x:Int,y:Int) {
  def dist(p:Point):Double={
   sqrt(pow((x-p.x),2)+pow(y-p.y,2))
  }
}
object day03Test01
{
  def main(args: Array[String]): Unit = {
    val p1 = Point(2,2)
    println(p1)
    val p2=Point(0,0)
    println(p1.dist(p2))
  }
}

