package day3

object day03Test02 {
  def main(args: Array[String]): Unit = {
    val colorNum=2
    val colorstr:String =colorNum match{
      case 1 =>"red"
      case 2 =>"green"
      case 3 =>"yellow"
      case _=>"Error"
    }
    println(colorstr)
  }
}
