package day2
import scala.io.Source
object Fileredea {
  def main(args: Array[String]): Unit = {
    val fileName ="F:\\node++笔记\\Scaladay2.scala"
    val source=Source.fromFile(fileName)
    val lines=source.getLines().mkString
//    val lines1=source.getLines().toBuffer
//    val lines2=source.getLines().toArray
    for(line<-lines)println(line)
    lines.foreach(println _)

  }
}
