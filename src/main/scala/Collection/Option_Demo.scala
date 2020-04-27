package Collection
//Scala - Options (Some or None)
object Option_Demo {
  val lst = List(1,2,3)
  val myMap: Map[Int, String] = Map(801 -> "Max", 802 -> "Tom", 804 -> "June")
  val opt: Option[Int] = Some(5)

  def main(args: Array[String]): Unit = {
    println(lst.find(_ > 5).getOrElse("Null"))
    println(myMap.get(801))
    println(opt.get)
  }
}
