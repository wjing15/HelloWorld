package Collection

object List_Demo {

  val myList = List(1,2,3,4,5,6,7,8,9)
  val name = List("J", "A", "C", "K")



  def main(args: Array[String]): Unit = {

    println(0 :: myList)
    println(name)
    println(1 :: 5 :: 9 :: Nil)
    println(myList.head)
    println(myList.tail)
    println(myList.reverse)
  }
}
