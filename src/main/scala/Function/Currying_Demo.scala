package Function
/* Currying is the technique of transforming a function
 * that takes multiple arguments into a function
 * that takes a single argument
 */

object Currying_Demo {

  def add(x: Int, y: Int) = x + y

  def add2 (x: Int) = (y: Int) => x + y

  def add3 (x: Int)(y: Int) =  x + y




  def main(args: Array[String]): Unit = {
    println(add(1,2))

    println(add2(20)(10))

    val sum40 = add2(40)(_: Int)

    println(sum40(20))
    println(add3(30)(40))

    val sum50 = add3(50)_

    println(sum50(50))


  }
}
