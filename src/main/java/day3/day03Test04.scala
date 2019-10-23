package day3
case class SubmitTask(id:String,name:String)
case class HeartBeat(time:Long)
case object CheckTimeOutTask
object day03Test04 {
  def main(args: Array[String]): Unit = {
    val lst=List(SubmitTask("tack01","tack01_test"),CheckTimeOutTask,HeartBeat(123456700))
    for (elem<- lst){
      elem match {
        case SubmitTask(param1, param2) => println(s"msg is SubmitTask. id = $param1; name = $param2")
        case HeartBeat(param1) => println(s"msg is HeartBeat. time = $param1")
        case CheckTimeOutTask => println("CheckTimeOutTask")
      }

    }
  }

}
