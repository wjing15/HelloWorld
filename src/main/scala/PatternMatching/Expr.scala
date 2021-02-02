package PatternMatching

trait Expr{
  def eval: Int
}

case class Number(n: Int) extends Expr{
  override def eval: Int = n
}

case class Sum(e1: Expr, e2: Expr) extends Expr{
  override def eval: Int = e1.eval + e2.eval
}

object expres extends App {
  def show(e: Expr): String = e match {
    case Number(x) => x.toString
    case Sum(l, r) => show(l) + " + " + show(r)
  }

  print(show(Sum(Number(1), Number(44))))
}

