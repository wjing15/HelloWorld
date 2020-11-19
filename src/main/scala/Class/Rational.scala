package Class

object Rational extends App {
  val x = new Rational(1, 2)
  val y = new Rational(2, 3)
  println(x.add(y))
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  override def toString = numer + "/" + denom
}