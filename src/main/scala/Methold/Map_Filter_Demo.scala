package Methold

object Map_Filter_Demo {
  val lst = List(1,2,3,4,5,6,7,8,9)
  val myMap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 804 -> "June")
  val opt: Option[Int] = Some(5)

  def main(args: Array[String]): Unit = {
    println(lst.map(_ / 0.2))
    println(lst.map(x => "Hi " * x))
    println("hello".map(_.toUpper))
    println(List(List(1,2,3), List(3,4,5)).flatten)

    println(lst.map(x => List(x, x + 1)))
    println(lst.flatMap(x => List(x, x + 1)))

    println(lst.filter(x => x%2 == 0))
    println(lst.filter(x => x%2 != 0))

  }
}
