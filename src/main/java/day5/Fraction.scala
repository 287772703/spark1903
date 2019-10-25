package day5
import scala.language.implicitConversions
class Fraction(m:Int,n:Int)extends Ordered[Fraction] {
  //断言
  assert(n!=0)
//定义最大公约数
  private val commondivisor=gcd(m,n)
  //定义分子
  val numberator=m / commondivisor
  //定义分母
 val denominator=n / commondivisor
  //复写toString
  override def toString: String = s"Fraction($numberator ,$denominator)"
 //定义最大公约数的函数
  private def gcd(a:Int,b:Int):Int={
    if (b==0) a else gcd(b,a%b)
  }
  def +(other:Fraction):Fraction={
    new Fraction(numberator * other.denominator + other.numberator * denominator, denominator * other.denominator)

  }
  override def compare(that: Fraction): Int = (numberator.toDouble / denominator).compare(that.numberator.toDouble / that.denominator)


  def +(other: Int): Fraction = {
    this + Fraction(other, 1)
  }
}
//复写apply方法，不用new对象
object Fraction{
  def apply(m: Int, n: Int): Fraction = new Fraction(m, n)
  def unapply(arg: Fraction): Option[(Int, Int)] =Some(arg.numberator,arg.denominator)
  implicit  def int2Fraction(x: Int): Fraction = new Fraction(x, 1)

}
object  Test
{
  def main(args: Array[String]): Unit = {
    // 1、能够友好的显示分数；
    // 2、不使用new能创建对象；
    val f1 = Fraction(5, 10)
    println(f1)
    val f2 = new Fraction(1, 9)

    val f3 = f1 + f2
    println(f3)

    val f4 = f3 + 1
    println(f4)

    val f5 = 1 + f3
    println(f5)

    val arr = Array(f5, f1, f2, f3, f4)
    arr.sorted.foreach(println)
  }
}
