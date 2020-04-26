package Function
/*
 * A closure is a function which uses one or more
 variables declared outside this function.
 */

object Closure_Demo {
  var number = 20
  val add = (x: Int) => {
    number = x + number
    number
  }


  def main(args: Array[String]): Unit = {
    number = 100
    println(add(20))
    println(number)
  }
}
