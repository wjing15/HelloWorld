package Collection

object Tuple_Demo {
  val myTuple = (1,2,"hello",true)
  val myTuple_1 = Tuple3(1,2,false)
  val myTuple_2 = Tuple4(1,2,false,(2,3))

  def main(args: Array[String]): Unit = {
    println(myTuple._3)

    myTuple.productIterator.foreach{
      i => println(i)
    }

    println(1 -> "James")
    println(myTuple_2._4._2)
  }
}
