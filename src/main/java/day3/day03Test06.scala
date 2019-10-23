package day3
case class Person(name: String,age:Int)
object day03Test06 {
  def main(args: Array[String]): Unit = {
    val p1 = Person("jack",23)
    p1 match {
      case  Person(name,age)=>println(s"name=$name,age=$age")
      case _=>println("error!")
    }
    val lst=(1 to 10 ).toList
    lst.filter(x=>x+1>10).foreach(println)
  }
}
