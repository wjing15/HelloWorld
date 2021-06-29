package OOO

object HelloWorld extends App {
  val name = "Pat Cook"
  val value = 42
  var age = 22
  var age2: Int = 23

  //String, Int, Double, Char, Boolean, Unit
  //Tuple
  val t = (1, 2.7, "Hi there")
  val (a, b, c) = t
  println(t._1)

  //String Interpolation
  val msg = name + " is " + age + " years old. "
  val msg2 = s"$name is ${age + 1} years old."
  val str = s"The second element of t is ${t._2}"

  //Statements and Expressions (produce value)
  name == "Pat Cook" * 5
  println(name)

  //Lambda Expression (function literals)
  val square: Double => Double = x => x * x
  println(square(23))
  val twice: Double => Double = _ * 2

  //comparision
  val lt: (Double, Double) => Boolean = _ < _

  //if and while
  var i = 0
  val response = if (age < 18) "No admin" else "Come in"
  println(response)

  //for loop/comprehensions
  val stuff = for {
    i <- 0 to 10
    if i % 3 == 0 || i % 5 == 0
    j <- 'a' to 'c'
    } yield {
      i -> j
   }
  println(stuff)

  //Match Expression
  val fizzbuzz = for {i <- 1 to 20} yield {
    (i%3, i%5) match {
      case(0, 0) => "fizzbuzz"
      case(0, _) => "fizz"
      case(_, 0) => "buzz"
      case _ => i.toString
    }
  }

























}
