package OOO

/*A pure object-orented language is one in which every value is an object.
* If the lanuage is based on classes, this mean that the type of each value is a class
*
*/
object obeject_oriented {

}

trait Expr{
  def eval: Int
}

class Number(n: Int) extends Expr{
  override def eval: Int = n
}

class Sum(e1: Expr, e2: Expr) extends Expr{
  override def eval: Int = e1.eval + e2.eval
}