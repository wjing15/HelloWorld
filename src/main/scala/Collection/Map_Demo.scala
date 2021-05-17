package Collection

object Map_Demo extends App {
  val myMap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 804 -> "June")
  val myMap_2: Map[Int, String]= Map(805 -> "Jeremy")

  val romanNumerals = Map("I" -> 1, "V" -> 5, "x" -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")

  println(
    capitalOfCountry("US"),
    capitalOfCountry("China")
  )
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
