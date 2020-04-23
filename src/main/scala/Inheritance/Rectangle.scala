package Inheritance

class Rectangle(var width: Double, var height:Double) extends Polygon {

  override def area: Double = width * height

}

object Rectangle{
  def main(args: Array[String]): Unit = {

  }
}
