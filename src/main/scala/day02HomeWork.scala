object day02HomeWork {
  def main(args: Array[String]): Unit = {

     def gcd(a: Int , b: Int ):  Int = if  (b == 0) a else gcd(b, a % b)
       println(gcd(2,4))
     def fun:(Int,Int)=>Any= (n1,n2)=>{
       if (n1==0){
         0
       }else if (n2==0){
         "字母不能为0"
       }else if (gcd(n1 ,n2 )==0){
         s"$n1/$n2"
       }else{
         (n1/gcd(n1 ,n2 )) / (n2/gcd(n1 ,n2 ))
       }
     }
    println(fun(7,4))

    def fbn(n:Int): Int ={
      if(n==1 || n==2) 1 else fbn(n-1)+fbn(n-2)
    }
    def fbn1(n: Int): Int = {
      if (n == 1) {
        return 1
      }
      if (n == 2) {
        return 1
      }
      var a = 1
      var b = 1
      var c = 0
      for (i <- 3 to n) {
        c = a + b
        a = b
        b = c
      }
      return c
    }





//    //// 1、获取一个字符串的首尾字符，写出2种不同的方法
//  val str ="fhasfsdfiiufwfj"
//    println(str.head)
//    println(str.last)
//    println(str.take(1))
//    println(str.takeRight(1))
//    println(str(0))
//    println(str.reverse(0))
//    println("****************************☺☺☺☺☺☺****************************")
////2、计算数组Array(1, 2, 3, 4, 5, 6, 7, 8)的平均值
//  val arr=Array(1, 2, 3, 4, 5, 6, 7, 8)
//    val avg=arr.sum*1.0/arr.length  //在做除法一定考虑double类型
//    println(avg)
//    println("*******************************************************")
//    // 4、给定一个整数数组，产出一个新的数组，包含原数组中的所有正值，以原有顺序排列，之后的元素是所有零或负值，以原有顺序排列
//   val random=scala.util.Random
//    val arr4=(1 to 100).toArray.map(elem=>
//    {
//      if (random.nextDouble()<=0.3) random.nextInt(100)* -1
//      else random.nextInt(100)
//    })
//    arr4(14)=0
//    val (x,y)=arr4.partition(_>0)
//    val result=x ++ y
//    result.foreach(println)
//    println("*******************************************************************")
//    // 5、两个Map的合并
//    val a = Map(("a", 1),  ("b", 2),  ("c", 3),  ("d", 4),  ("e", 5))
//    val b = Map(("b", 20), ("c", 30), ("d", 40), ("e", 50), ("f", 60))
//    val c = a ++ b.map{
//      case (key,value)=>
//        val newValue=value +a.getOrElse(key,0)
//        (key,newValue)
//    }
//    println(c)
//    println("*****************************************************************")
//
//    // 6、数组中包含一些列等长的数组，求这些数组元素的和
//    val arr6 = Array(Array(1,2,3), Array(4,5,6), Array(7,8,9))
//    //reduce 不能让数组相加 先定义让数组相加的函数
//    def  arrayAdd(x:Array[Int],y:Array[Int]):Array[Int] = {
//      x.zip(y).map{case (n1,n2) =>  n1+n2}
//    }
//    arr6.reduce(arrayAdd(_, _)).foreach(println)
//    println("*****************************************************************")
//    // 3、编写一个函数minmax(values:Array[Int]),同时返回数组中的最小值和最大值
//    val arr2 = Array(1, 2, 3, 4, 5, 6, 7, 8)
//    val max1 = arr2.reduce((x,y) => {
//      println(x,y)
//      if ( x > y) x else y})
//    println(max1)
//    val min1 = arr2.reduce((x,y) => if ( x < y) x else y)
//    println(min1)
//    println("******************************************************")
//    arr2.reduce((x, y) => {
//      println(s"x = $x, y = $y, (x+y)= ${x+y}")
//      x + y
//    })
//    println("******************************************************")
//    arr2.reduceLeft((x, y) => {
//      println(s"x = $x, y = $y, (x+y)= ${x+y}")
//      x + y
//    })
//    println("******************************************************")
//    arr2.reduceRight((x, y) => {
//      println(s"x = $x, y = $y, (x+y)= ${x+y}")
//      x + y
//    })
//    println("******************************************************")
//
//    val foldResult = arr2.fold(0)((x, y) => {
//      println(s"x = $x, y = $y, (x+y)= ${x+y}")
//      x + y
//    })
//    println(s"foldResult = $foldResult")
//
//    // 最大、最小
//    val (max, min) = arr2.foldLeft((java.lang.Long.MIN_VALUE, java.lang.Long.MAX_VALUE))((x, y)=> {
//      val max = if (x._1 > y) x._1 else y
//      val min = if (x._2 < y) x._2 else y
//      (max, min)
//    })
//    println(max, min)
//    arr4.min

  }

}
