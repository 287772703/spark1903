package day3

object day03Test03 {
  def main(args: Array[String]): Unit = {
    for (elem <- List(9, 10, 1.2, "spark", "hadoop", 'Hello)){
      val str1 = elem match {
        case i:Int if i==10=> s"$i is int"
        case j:Double=>s"$j is double"
        case "spark" =>"string is spark"
        case str:String=>s"$str is string"
        case _=>"other"
      }
      println(str1)
    }
    List(9, 10, 1.2, "spark", "hadoop", 'Hello).map(elem=>
    elem match {
      case i:Int if i==10=> s"$i is int"
      case j:Double=>s"$j is double"
      case "spark" =>"string is spark"
      case str:String=>s"$str is string"
      case _=>"other"
    }).foreach(println)
  }
}
