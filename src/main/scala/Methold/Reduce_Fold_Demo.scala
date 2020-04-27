package Methold

object Reduce_Fold_Demo {
  val lst = List(1,2,3,4,5,6,7,8,9)
  val lst_2 = List("A", "B", "C")

  def main(args: Array[String]): Unit = {
    println(lst_2.reduceLeft(_ + _))
    println(lst.reduceLeft(_ + _))

    //reduceLeft is similar to foldLeft
    println(lst.reduceLeft((x, y) => {println(x + "," + y); x + y }))
    println(lst.reduceLeft(_ - _))
    println(lst.reduceRight(_ - _))
    println(lst.reduceRight((x, y) => {println(x + "," + y); x - y }))

    println(x = lst.foldLeft(0)(_ + _))
    println(x = lst.foldLeft(100)(_ + _))
    println(x = lst_2.foldLeft("Z")(_ + _))

    //scanLeft is similar to foldLeft but give intermediate result also
    println(x = lst.scanLeft(100)(_ + _))
    println(x = lst_2.scanLeft("Z")(_ + _))



  }
}
