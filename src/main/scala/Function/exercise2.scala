package Function

object exercise2 extends App {
  def loop(f: Int => Int, a: Int, b: Int) = {
    def loop(a: Int, acc: Int): Int =
      if(a > b) acc
      else loop(a + 1, f(a) + acc)_
    loop(a, 0)
  }

  def product(f: Int => Int)(a: Int, b: Int): Int =
    if(a > b) 1
    else f(a) * product(f)(a + 1, b)
  product(x => x * x)(3,4)


  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int): Int =
    if (a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))


}
