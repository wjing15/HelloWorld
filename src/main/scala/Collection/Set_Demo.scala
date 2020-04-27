package Collection

object Set_Demo {
  val mylist: List[Int] = List(1,2,3,4,5,6,6)
  val names: Set[String] = Set("Max","Tom","John")
  val mySet: Set[Int] = Set(1,2,3,4,4)
  var newSet = scala.collection.mutable.Set(1,2,3,4,5,5)

  def main(args: Array[String]): Unit = {
    println(mySet)
    println(newSet)

    newSet = scala.collection.mutable.Set(1,2,3,4,5,9,9)
    println(newSet)
    println(mySet ++ newSet)

    mySet.foreach(println)
    for(name <- names){
      println(name)
    }
  }
}
