package Class

object Rational extends App {
  val x = new Rational(1, 2)
  val y = new Rational(2, 3)
  println(new Rational(2))
  println(x.add(y))
}

class Rational(x: Int, y: Int) {
  //take a condition and option arg
  //assert is userd as to check the code of the function itself
  require(y != 0, "denominator must be nonzero")

  //the construct of the class
  def this(x: Int) = this(x, 1)

  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def less(that: Rational) =
    numer * that.denom < that.numer * denom

  def max(that: Rational) =
    if(this.less(that)) that else this

  override def toString = numer + "/" + denom
}