package Abtraction

class A_Rectangle(var width: Double, var height: Double) extends A_Polygon {
  override def area: Double = width * height
}
