package Function

import java.util.Date

class Partically_Applied_Func {

}

object Partically_Applied_Func{
  def main(args: Array[String]): Unit = {

    def log(date: Date, message: String) = {
      println(date + "  " + message)
    }

    val sum = (a: Int, b:Int, c:Int) => a + b + c

    val f = sum(10, _: Int, _: Int)

    println(f(20, 30))

    val date = new Date()
    val newLog = log(date, _: String)

    newLog("The message 1")

  }
}
