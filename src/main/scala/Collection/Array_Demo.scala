package Collection

object Array_Demo {

  val myArray2 = new Array[String](5)
  val xs = Array(1, 2, 3, 44)

  def main(args: Array[String]): Unit = {
    myArray2(0) = "H";
    myArray2(1) = "E";
    myArray2(2) = "L";
    myArray2(3) = "L";
    myArray2(4) = "O";

    for (x <- myArray2){
      println(x)
    }

    xs map (x => x * 2)
    val s = "Hello Word"
    val upper = s filter (c => c.isUpper)

    for(y <- xs) println(y)

    val result = s.flatMap(c => List('.', c))
    println(result)

  }
}
