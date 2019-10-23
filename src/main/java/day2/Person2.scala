package day2
class Person2 {
  private var name =""
  private var age = 0
  //辅助构造器
  def this(name:String){
    this()//调主构造器
    this.name=name
  }
  def this(name:String,age:Int){
    this()
    this.name=name
    this.age=age
  }
  def decription = name+ "is"+age+"years old"
}
object Person2
{
  def main(args: Array[String]): Unit = {
    val p1 = new Person2 //主构造器
    val p2= new Person2("james")//调用第一个辅助构造器
    val p3 =new Person2("james",23)//调用第二个辅助构造器
    println(p1.decription)
    println(p2.decription)
    println(p3.decription)

  }
}