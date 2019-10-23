package day2

abstract  class Car {
  val carBrand: String
  def info()
  def greeting() {println("welcome to my car")}
}

class BMWCar extends Car{
  override val carBrand: String = "BMW"
  def info() {println(s"This is my $carBrand car.")}
  override def greeting() {println("welcome to my BMW car")}
}

class BYDCar extends Car{
  override val carBrand: String = "BYD"
  def info() {println(s"This is my $carBrand car.")}
  override def greeting() {println("welcome to my BYD car")}
}

object Day02Test08{
  def main(args: Array[String]): Unit = {
    val car1 = new BMWCar
    val car2 = new BYDCar
    car1.info()
    car1.greeting()
    car2.info()
    car2.greeting()
  }
}
