package day2
import scala.io.Source
object Fileredea {
  def main(args: Array[String]): Unit = {
//    val fileName ="F:\\node++笔记\\wordCount.txt"
//    val source=Source.fromFile(fileName)
//    val lines2=source.getLines().toArray
//    val b =lines2.map(elem=>elem.split(" ")).flatten.toList
//    val c =b.map((_,1)).groupBy(_._1).map(x=>(x._1,x._2.size)).foreach(println)
    //第一步获取数据文件的地址、
    val filename ="F:\\node++笔记\\wordCount.txt"
    //读取该文件
    val sourse=Source.fromFile(filename)
    //将读取的出来的每一行放入List中
    val lines=sourse.getLines().toList
    //对放入List集合中用map遍历对每一个元素进行Split切分
    val lineWord=lines.map(elem=>elem.split(" "))
    //对切分的出来的数据进行压平 List（Array（）,Array（）,..）
    val words=lineWord.flatten
    //给List集合中的每一个元素赋值为 1 、
    val wordOne = words.map(elem =>(elem,1))
    //进行分组
    val wordgroup=wordOne.groupBy(_._1)
    //统计每个单词的个数(Sriharsha,List((Sriharsha,1), (Sriharsha,1), (Sriharsha,1), (Sriharsha,1)))
    val wordCount = wordgroup.map(elem => (elem._1,elem._2.length))

    //也可以一条龙服务、
    val wordCount1=Source.fromFile(filename).getLines().toList.map( elem=> elem.split(" ")).flatten.map(elem=> (elem,1)).groupBy(_._1).map(elem=>(elem._1,elem._2.length)).foreach(println)
  }
}
