package Collection

object Sets_Demo extends App {
  val fruit = Set("apple", "banana", "pear")
  val s = (1 to 6).toSet

  //Unorder, no-dupe
  println(
    s map (_ + 2),
    fruit filter (_.startsWith("app")),
    s.nonEmpty
  )

  //N-Queens
  
}
