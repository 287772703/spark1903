// scala中一个文件可以包含多个class，class缺省的可见性为public
// var修饰的变量，对外提供getter、setter方法
// val修饰的变量，对外提供getter；没有setter方法
class Student {
  var name = "tom"
  // 可以_做初始化；对引用类型来说默认值为null；对于值类型（AnyVal）来说：0/false
  // 使用_做初始化，要声明类型
  var nickName: String = _

  val age = 10

  private var hobby = "game"

  private[this] val IDCard = "10010xxxx001"
}

object Student{
  def main(args: Array[String]): Unit = {
    val s1 = new Student
    println(s1.name, s1.nickName, s1.age)

    s1.name = "big Tom"
    s1.nickName = "bigger"
    println(s1.name, s1.nickName, s1.age)
  }
}
