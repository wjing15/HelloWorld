package Methold

object Sort_Demo extends App {

/*
 * A function takes an implicit parameter of type T
 * The compiler will search an implicit definition that
 */
  def msort[T](xs: List[T])(implicit ord: Ordering[T]): List[T] = {
    val n = xs.length/2
    if(n == 0) xs
    else{
      def merge(xs: List[T], ys: List[T]):List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x :: xs1, y :: ys1)  =>
          if (ord.lt(x, y)) x :: merge(xs1, ys)
          else y :: merge(xs, ys1)
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst), msort(snd))
    }
  }

  val nums = List(2, -4, 5, 7 ,1)
  val fruits = List("apple", "pineapple", "orange", "banana")

  println(
    msort(nums)
  )
  println(
    msort(fruits)
  )

//  def merge(xs: List[Int], ys: List[Int]): List[Int] =
//    xs match {
//      case Nil => ys
//      case x :: xs1 =>
//        ys match {
//          case Nil => xs
//          case y :: ys1 =>
//            if(x < y) x :: merge(xs1, ys)
//            else y :: merge(xs, ys1)
//        }
//    }



}
