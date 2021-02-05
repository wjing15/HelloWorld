package Collection

object List_Demo {


  val myList = List(8,1,2,3,4,5,6,7,8,9)
  val name = List("J", "A", "C", "K")
  val fruit = List("apples", "oranges","pears")
  val nums = List(1,2,3,4)
  val diag3 = List(List(1,0,0), List(0,1,0), List(0,0,1))
  val empty = List()

  def isort(xs: List[Int]): List[Int] = xs match {
    case List() => List()
    case y :: ys => insert(y, isort(ys))
  }

  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
    case List() => List(x)
    case y :: ys => if(x <= y) x :: xs else y :: insert(x, ys)
  }

  def last[T](xs: List[T]): T = xs match {
    case List() => throw new Error("Last of empty list")
    case List(x) => x
    case y:: ys => last(ys)
  }

  def init[T](xs: List[T]): List[T] = xs match {
    case List() => throw new Error("Init of empty list")
    case List(x) => List()
    case y :: ys => y :: init(ys)
  }

  def concat[T](xs: List[T], ys: List[T]):List[T] = xs match {
    case List() => ys
    case z :: zs => z :: concat(zs, ys)
  }

  def reverse[T](xs: List[T]): List[T] = xs match {
    case List() => xs
    case y :: ys => reverse(ys) ++ List(y)
  }

  def removeAt(n: Int, xs: List[Int])
    = (xs take n) ::: (xs drop n + 1)

  def main(args: Array[String]): Unit = {
    println(0 :: myList)
    println(name)
    println(1 :: 5 :: 9 :: Nil)
    println(myList.head)
    println(myList.tail)
    println(myList.reverse)
    println(fruit.tail.head)
    println(fruit.isEmpty)
    println(myList.sorted)
    println(nums :: diag3)
    println(nums ++ diag3)
    println(myList.last)
  }
}
