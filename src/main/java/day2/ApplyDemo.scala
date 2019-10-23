package day2

class ApplyDemo {
  def apply() = println("apply() method in class is called")
  def info() = println("info() method in class is called")
}

object ApplyDemo {
  def apply() = {
    println("apply() method in object is called")
    new ApplyDemo;
  }

  def main(args: Array[String]): Unit = {
    ApplyDemo.apply()
    ApplyDemo()
//        val ad1 = ApplyDemo()
//        println(ad1)
//        ad1.apply()
//
//        val arr = Array(1,2,3,4)
//        arr(2) = 10000
//        arr.update(2, 100)
  }
}