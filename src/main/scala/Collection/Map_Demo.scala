package Collection

object Map_Demo {
  val myMap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 804 -> "June")
  val myMap_2: Map[Int, String]= Map(805 -> "Jeremy")
  def main(args: Array[String]): Unit = {
    println(myMap)
    println(myMap(801))
    println(myMap.keys)
    println(myMap.values)
    println(myMap.isEmpty)

    myMap.keys.foreach {
      key => println("key "+ key)
        println("Value "+ myMap(key))
    }

    println(myMap.contains(801))
    println(myMap ++ myMap_2)
  }
}
