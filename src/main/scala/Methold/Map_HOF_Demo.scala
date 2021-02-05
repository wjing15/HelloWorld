package Methold

object Map_HOF_Demo extends App {

    def squareList(xs: List[Int]): List[Int] = xs match {
      case Nil => Nil
      case y :: ys => y * y :: squareList(ys)
    }

    def squareList_map(xs: List[Int]): List[Int] =
      xs.map(x => x * x)

    def postElemes(xs: List[Int]): List[Int] =
      xs.filter(x => x > 0)

println(
  squareList_map(List(1,2,3,4,5))
)
println(
  postElemes(List(-1, -2, 3, 5))
)

  val nums = List(2, -4, 5, 7 ,1)
  val fruits = List("apple", "pineapple", "orange", "banana")

  println(
    nums.filter(x => x > 0),
    nums.filterNot(x => x > 0),
    nums.partition(x => x > 0),

    nums.takeWhile(x => x > 0),
    nums.dropWhile(x => x > 0),
    nums.span(x => x > 0)
  )

  val data = List("a", "a", "a", "b", "b", "c", "c", "a")
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 =>
      val(first, rest) = xs.span((y => y == x))
      first :: pack(rest)
  }
  println(
    pack(data)
  )

  def encode[T](xs: List[T]): List[(T, Int)] =
    pack(xs).map(x => (x.head, x.length))

  println(
    encode(data)
  )

  val num = List(1,2,3,4,5,6,7,8,9)

  def sum(xs: List[Int]): Int =
    xs.reduceLeft(_ + _)

  def product(xs: List[Int]): Int =
    xs.foldLeft(1)(_ * _)

  println(
    product(num)
  )

  println(
    sum(num)
  )

  def concat[T](xs: List[T], ys: List[T]): List[T] =
    (xs.foldRight(ys))(_ :: _)

}
