package Function

class High_Order_Function {

}

object High_Order_Function {

  def math(x: Double, y: Double, z:Double, f:(Double, Double) => Double): Double
    = f(f(x, y), z)

  def main(args: Array[String]): Unit = {
    val result = math(50.0, 20.0, 30.0, _ + _)
    println(result)
  }
}
