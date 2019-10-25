package day5

object Pascal {
  def main(args: Array[String]): Unit = {
    fun(5)
  }
  def fun(n:Int):Unit={
    for(i <- Range(1,2*n+1,2)){
      println(" "*((2*n-i)/2) + "*"*i)
    }
  }

}
