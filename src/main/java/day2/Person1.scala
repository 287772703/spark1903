package day2
import scala.beans.BeanProperty
class Person1 {
  @BeanProperty
  var name:String = _
  @BeanProperty
  var age:Int = _

}
object day02Test04
{
  def main(args: Array[String]): Unit = {
    val p1 = new Person1
    p1.setAge(20)
    p1.setName("james")
    println(p1.getName,p1.getAge)

  }
}