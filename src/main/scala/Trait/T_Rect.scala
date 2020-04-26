package Trait

class T_Rect(width: Double, height: Double) extends T_Polygan with Shape {

  override def area: Double = width * height
  override def color: String = "Red"

}

