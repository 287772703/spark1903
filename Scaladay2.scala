常用的方法 
过一遍方法 再脑子有一点印象 记住关键的 map reduce count foreach zip filter  tail last take init
map(a => a._1-a._2 )


a++b
b++a   

Map
contains,key ,values, getOrElse(,0)

Tuple包含不同数据类型的集合，常用来返回结果，tuple._1,tuple._2


第二部分
面相对象编程
小的-->函数
大的-->面向对象

private[this] 

数组的常用方法 -- drop ---take 
take  ---返回的是一个新的数组
Array(1,2,3,4,5,6,7,8,9,10).take(4)
Array(1,2,3,4,5,6,7,8,9,10).takeRight(4)
Array(1,2,3,4,5,6,7,8,9,10).takeWhile(_<5)

Array(1,2,3,4,5,6,7,8,9,10).drop(4)
Array(1,2,3,4,5,6,7,8,9,10).dropRight(4)
Array(1,2,3,4,5,6,7,8,9,10).dropWhile(_<5) 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
scala> Array(1,2,3,4,5,6,7,8,9,10).take(4)
res0: Array[Int] = Array(1, 2, 3, 4)

scala> Array(1,2,3,4,5,6,7,8,9,10).takeRight(4)
res1: Array[Int] = Array(7, 8, 9, 10)

scala> Array(1,2,3,4,5,6,7,8,9,10).takeWhile(_<5)
res2: Array[Int] = Array(1, 2, 3, 4)


scala> Array(1,2,3,4,5,6,7,8,9,10).drop(4)
res3: Array[Int] = Array(5, 6, 7, 8, 9, 10)

scala> Array(1,2,3,4,5,6,7,8,9,10).dropRight(4)
res4: Array[Int] = Array(1, 2, 3, 4, 5, 6)

scala> Array(1,2,3,4,5,6,7,8,9,10).dropWhile(_<5)
res5: Array[Int] = Array(5, 6, 7, 8, 9, 10)


数组常用方法 -------span splitAt partition
Array(1,2,3,4,5,6,7,8,9,10).span(_==5)
Array(1,2,3,4,5,6,7,8,9,10).span(_<5)
Array(1,2,3,4,5,6,7,8,9,10).splitAt(5)
Array(1,2,3,4,5,6,7,8,9,10).partition(_==3)

scala> Array(1,2,3,4,5,6,7,8,9,10).span(_==5)
res10: (Array[Int], Array[Int]) = (Array(),Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))

scala> Array(1,2,3,4,5,6,7,8,9,10).span(_<5)
res11: (Array[Int], Array[Int]) = (Array(1, 2, 3, 4),Array(5, 6, 7, 8, 9, 10))

scala> Array(1,2,3,4,5,6,7,8,9,10).splitAt(5)
res12: (Array[Int], Array[Int]) = (Array(1, 2, 3, 4, 5),Array(6, 7, 8, 9, 10))

scala> Array(1,2,3,4,5,6,7,8,9,10).partition(_==3)
res13: (Array[Int], Array[Int]) = (Array(3),Array(1, 2, 4, 5, 6, 7, 8, 9, 10))

常用方法 ---padTo slice sliding updated
Array(1,2,3,4,5,6,7,8,9,10).padTo(20,8)
Array(1,2,3,4,5,6,7,8,9,10).slice(2,5)
Array(1,2,3,4,5,6,7,8,9,10).sliding(3).toArray
Array(1,2,3,4,5,6,7,8,9,10).sliding(3,2).toArray
Array(1,2,3,3).updated(3,4)

scala> Array(1,2,3,4,5,6,7,8,9,10).padTo(20,8)
res23: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8)

scala> Array(1,2,3,4,5,6,7,8,9,10).slice(2,5)
res24: Array[Int] = Array(3, 4, 5)

scala> Array(1,2,3,4,5,6,7,8,9,10).sliding(3).toArray
res25: Array[Array[Int]] = Array(Array(1, 2, 3), Array(2, 3, 4), Array(3, 4, 5), Array(4, 5, 6), Array(5, 6, 7), Array(6, 7, 8), Array(7, 8, 9), Array(8, 9, 10))

scala> Array(1,2,3,4,5,6,7,8,9,10).sliding(3,2).toArray
res26: Array[Array[Int]] = Array(Array(1, 2, 3), Array(3, 4, 5), Array(5, 6, 7), Array(7, 8, 9), Array(9, 10))

scala> Array(1,2,3,3).updated(3,4)
res27: Array[Int] = Array(1, 2, 3, 4)

常用方法
val a1= Array("A","B","C")
val a2= Array(1,2,3,4)
val z1=a1.zip(a2)
val z2=a1.zipAll(a2,"*",-1)
val z3=a1.zipAll(a2,-1,"*")
val z4=a1.zipWithIndex
val (11,12) =z4.unzip
val (11,12,13)=Array((1, "one", '1'),(2, "two", '2'),(3, "three", '3')).unzip3

scala> val a1= Array("A","B","C")
a1: Array[String] = Array(A, B, C)

scala> val a2= Array(1,2,3,4)
a2: Array[Int] = Array(1, 2, 3, 4)

scala> val z1=a1.zip(a2)
z1: Array[(String, Int)] = Array((A,1), (B,2), (C,3))

scala> val z2=a1.zipAll(a2,"*",-1)
z2: Array[(String, Int)] = Array((A,1), (B,2), (C,3), (*,4))

scala> val z3=a1.zipAll(a2,-1,"*")
z3: Array[(Any, Any)] = Array((A,1), (B,2), (C,3), (-1,4))

scala> val z4=a1.zipWithIndex
z4: Array[(String, Int)] = Array((A,0), (B,1), (C,2))

????没法运行
// unzip 的逆操作，拆分成2个数组 // 11,12代表的是组名
val (l1,l2) = z4.unzip
val (l1,l2,l3) = Array((1, "one", '1'),(2, "two", '2'),(3, "three", '3')).unzip3

常用的方法
val a =(1 to 10 ).toArray
a.head
a.last
a.tail
a.init
a.combinations(2).foreach(x => println(x.toBuffer))
val list=(1 to 10 ).toList
list.sum
list.max
list.take(4)
list.drop(4)

scala> val a =(1 to 10 ).toArray
a: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> a.head
res28: Int = 1

scala> a.last
res29: Int = 10

scala> a.tail
res30: Array[Int] = Array(2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> a.init
res31: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> a.combinations(2).foreach(x => println(x.toBuffer))
ArrayBuffer(1, 2)
ArrayBuffer(1, 3)
ArrayBuffer(1, 4)
ArrayBuffer(1, 5)
ArrayBuffer(1, 6)
ArrayBuffer(1, 7)
ArrayBuffer(1, 8)
ArrayBuffer(1, 9)
ArrayBuffer(1, 10)
ArrayBuffer(2, 3)
ArrayBuffer(2, 4)
ArrayBuffer(2, 5)
ArrayBuffer(2, 6)
ArrayBuffer(2, 7)
ArrayBuffer(2, 8)
ArrayBuffer(2, 9)
ArrayBuffer(2, 10)
ArrayBuffer(3, 4)
ArrayBuffer(3, 5)
ArrayBuffer(3, 6)
ArrayBuffer(3, 7)
ArrayBuffer(3, 8)
ArrayBuffer(3, 9)
ArrayBuffer(3, 10)
ArrayBuffer(4, 5)
ArrayBuffer(4, 6)
ArrayBuffer(4, 7)
ArrayBuffer(4, 8)
ArrayBuffer(4, 9)
ArrayBuffer(4, 10)
ArrayBuffer(5, 6)
ArrayBuffer(5, 7)
ArrayBuffer(5, 8)
ArrayBuffer(5, 9)
ArrayBuffer(5, 10)
ArrayBuffer(6, 7)
ArrayBuffer(6, 8)
ArrayBuffer(6, 9)
ArrayBuffer(6, 10)
ArrayBuffer(7, 8)
ArrayBuffer(7, 9)
ArrayBuffer(7, 10)
ArrayBuffer(8, 9)
ArrayBuffer(8, 10)
ArrayBuffer(9, 10)

scala> val list=(1 to 10 ).toList
list: List[Int] = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

scala> list.sum
res33: Int = 55

scala> list.max
res34: Int = 10

scala> list.take(4)
res35: List[Int] = List(1, 2, 3, 4)

scala> list.drop(4)
res36: List[Int] = List(5, 6, 7, 8, 9, 10)

用于数组的操作符

val a =(1 to 4).toArray
val b =(1 to 8).toArray
val c =10 +: a
val d =c  :+ 9 
val e =a ++ b 
scala> val a =(1 to 4).toArray
a: Array[Int] = Array(1, 2, 3, 4)

scala> val b =(1 to 8).toArray
b: Array[Int] = Array(1, 2, 3, 4, 5, 6, 7, 8)

scala> val c =10 +: a
c: Array[Int] = Array(10, 1, 2, 3, 4)

scala> val d =c  :+ 9
d: Array[Int] = Array(10, 1, 2, 3, 4, 9)

scala> val e =a ++ b
e: Array[Int] = Array(1, 2, 3, 4, 1, 2, 3, 4, 5, 6, 7, 8)

基础语法 --- Map
val a = Map("a"->1,"b"->2,"c"->3)
val b =Map(("a",1),("b",2),("c",3))
a.keys.foreach(println)
a.values
b.keys
b.values

scala> val a = Map("a"->1,"b"->2,"c"->3)
a: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c -> 3)

scala> val b =Map(("a",1),("b",2),("c",3))
b: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c -> 3)

scala> a.keys
res37: Iterable[String] = Set(a, b, c)

scala> a.values
res38: Iterable[Int] = MapLike(1, 2, 3)

scala> b.keys
res39: Iterable[String] = Set(a, b, c)

scala> b.values
res40: Iterable[Int] = MapLike(1, 2, 3)

scala> a.keys.foreach(println)
a
b
c

a("a")
a("v")
a.get("a")
a.getOrElse("i",0)

scala> a("a")
res44: Int = 1

scala> a("v")
java.util.NoSuchElementException: key not found: v
  at scala.collection.MapLike$class.default(MapLike.scala:228)
  at scala.collection.AbstractMap.default(Map.scala:59)
  at scala.collection.MapLike$class.apply(MapLike.scala:141)
  at scala.collection.AbstractMap.apply(Map.scala:59)
  ... 32 elided

scala> a.get("a")
res46: Option[Int] = Some(1)

scala> a.getOrElse("i",0)
res47: Int = 0

a.get("a","b","c")---报错

val b = scala.collection.mutable.Map("a"->1,"b"->2,"c"->3)
b("a") =2 
b("d") =4
b +=("e"->1,"f"->2)
b -="a"
val b =Map("a" ->1,"b"->2,"c"->3)
val c =b +("a"-> 10,"b"->20)
scala> val b = scala.collection.mutable.Map("a"->1,"b"->2,"c"->3)
b: scala.collection.mutable.Map[String,Int] = Map(b -> 2, a -> 1, c -> 3)

scala> b("a") =2

scala> b("d") =4

scala> b +=("e"->1,"f"->2)
res51: b.type = Map(e -> 1, b -> 2, d -> 4, a -> 2, c -> 3, f -> 2)

scala> b -="a"
res52: b.type = Map(e -> 1, b -> 2, d -> 4, c -> 3, f -> 2)

scala> val b =Map("a" ->1,"b"->2,"c"->3)
b: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c -> 3)

scala> val c =b +("a"-> 10,"b"->20)
c: scala.collection.immutable.Map[String,Int] = Map(a -> 10, b -> 20, c -> 3)

val a = Map(("a", 1),("b", 2),("c", 3))
for(v <- a.values) println(v)
val b= for((k,v)<- a) yield(v,k) 

scala> val a = Map(("a", 1),("b", 2),("c", 3))
a: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c -> 3)

scala> for(v <- a.values) println(v)
1
2
3

scala> val b= for((k,v)<- a) yield(v,k)
b: scala.collection.immutable.Map[Int,String] = Map(1 -> a, 2 -> b, 3 -> c)

val a = Array(1,2,3)
val b = Array("a","b","c")
val c = a.zip(b)
val c = a.zip(b).toMap

scala> val a = Array(1,2,3)
a: Array[Int] = Array(1, 2, 3)

scala> val b = Array("a","b","c")
b: Array[String] = Array(a, b, c)

scala> val c = a.zip(b)
c: Array[(Int, String)] = Array((1,a), (2,b), (3,c))

scala> val c = a.zip(b).toMap
c: scala.collection.immutable.Map[Int,String] = Map(1 -> a, 2 -> b, 3 -> c)

val a =("java",1,1.34,1.5,'d')
a._1
a._2
a._3
a._4
a._5
scala> val a =("java",1,1.34,1.5,'d')
a: (String, Int, Double, Double, Char) = (java,1,1.34,1.5,d)

scala> a._1
res61: String = java

scala> a._2
res62: Int = 1

scala> a._3
res63: Double = 1.34

scala> a._4
res64: Double = 1.5

scala> a._5
res65: Char = d
a._1
a _2
a._3
a _4

val a = Tuple23(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3)
//报错，元素的个数上限是22个
val a = (1, 1.2, "ad", 'd')
Tuple的访问形式比较特殊：
a._1 // 元组的下标从1开始
a _2
a._3
a _4
val (a1, a2, a3, a4), a5 = a
val (b1, _, b2, _), b5 = a
元组的遍历
a.productIterator