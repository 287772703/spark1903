package day5

case class Fraction1(private val n:Int,private val m:Int) {
  private val commondivisor=gcd(n,m)
  private val numerator =n /commondivisor
  private val  denominator=m / commondivisor
  def gcd(a:Int,b:Int):Int={
    if(b==0) a else gcd(b,a%b)
  }
  def +(o:Fraction1):Fraction1={
    new Fraction1(numerator*o.denominator+o.numerator*denominator,denominator*o.denominator)
  }
  override def toString: String = s"Fraction1($numerator,$denominator)"
}
object Fraction1{
  def main(args: Array[String]): Unit = {
    val f1= Fraction1(6,9)
    val f2= Fraction1(3,6)
    val f3=f1.+(f2)
    println(f1)
    println(f3)
  }
}


