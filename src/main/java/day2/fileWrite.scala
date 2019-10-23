package day2
import  scala.io.Source
import java.io.PrintWriter
object fileWrite {
  def main(args: Array[String]): Unit = {
//    val lines=Source.fromFile("F:\\node++笔记\\Scaladay2.scala").mkString
    ////    var  out =new PrintWriter("g:\\out.log")
    ////    for (i <- 1 to 10){
    ////      out.print(i + "+") // 写入一个特殊的文件头
    ////    }
    ////    out.println
    ////    out.println(lines)
    ////    out.close()
   val a=minmax(Array(1,2,3,4,5,6,7))
    print(a)
  }
  def minmax(values:Array[Int]):(Int,Int)={
    (values.max,values.min)
  }

}
