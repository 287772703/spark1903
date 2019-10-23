object Holle {
  def main(args: Array[String]): Unit = {
    val a = 1.to(10).toArray
    val x =sum(1,2,3,4)
    val y = sum(a:_*)
    println(x)
    println(y)
  }
 def sum(args:Int*)={
   var result = 0
   for(arg <- args) result+=arg
   result
 }
}
