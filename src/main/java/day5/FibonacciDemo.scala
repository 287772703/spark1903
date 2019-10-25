package day5

object FibonacciDemo {
  def main(args: Array[String]): Unit = {
    val meno=new Array[Long](11)
    println(fun1(10))
    println(fun2(10))
    println(fun3(10))
    println(fun4(10,meno))
    meno.foreach(println)

  }
  //第一种方法为递归
  //为什么返回的数据类型选择Long，防止返回的数值过大
  def fun1(n:Int):Long = {
    assert(n>0,"请输入大于0的数值")
    if(n==1) 1
    else if(n==2)2
    else
      fun1(n-1)+fun1(n-2)
  }
  //循环实现
  def fun2(n:Int):Long={
    assert(n>0,"请输入大于0的数值")
    var x = 1L
    var y = 2L
    var z = 0L
    for(i<-3 to n){
     z =x + y
     x=y
     y=z
    }
   z
  }
  //循环--- 用数组装值
  def fun3(n:Int):Long = {
   assert(n>0,"请输入大于0的数值")
   val arr= new Array[Long](n+1)
    arr(1)=1L
    arr(2)=2L
    for (i<-3 to n){
      arr(i)=arr(i-1)+ arr(i-2)
    }
    arr(n)
  }
  //忘备录 --- 就是对算出来的值进行存放，可以避免递归大量的计算

  def fun4(n: Int,meno:Array[Long]):Long={
    assert(n>0,"请输入大于0的数值")
    if(n==1) 1
    else if(n==2) 2
    else if(meno(n)!=0) meno(n)
    else{
      meno(n)=fun4(n-1,meno)+ fun4(n-2,meno)
      meno(n)
    }

  }


}
