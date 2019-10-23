package day3

object day03Test05 {
  def main(args: Array[String]): Unit = {
    val str = "a,b,1,2,3,0,de,f,rf,6,7,8,9,0"

    val ints: Array[Int] = str.split(",").map(elem => {
      Custom2Int(elem)
    }).map(elem => if (elem == None) -1 else elem.get)
    val a = ints
    a.foreach(println)
  }

  def Custom2Int(str: String): Option[Int] = {
    try{
      Some(str.toInt)
    }catch {
      case e => None
    }
  }
}
