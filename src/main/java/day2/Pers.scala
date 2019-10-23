package day2

class Pers {
  val name ="Person"
  def age =20

}
class Stus extends Pers{
  override val name:String="javd"

  override def age: Int = 30
}
object  day02Test09{
  def main(args: Array[String]): Unit = {
    val  per =new Stus
    println(per.getClass)
    var stus:Stus=null
    if (per.isInstanceOf[Stus])
      stus=per.asInstanceOf[Stus]
    println(stus.getClass)
  }

}