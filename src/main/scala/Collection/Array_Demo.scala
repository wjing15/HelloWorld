package Collection

object Array_Demo {

  val myArray2 = new Array[String](5)

  def main(args: Array[String]): Unit = {
    myArray2(0) = "H";
    myArray2(1) = "E";
    myArray2(2) = "L";
    myArray2(3) = "L";
    myArray2(4) = "O";

    for (x <- myArray2){
      println(x)
    }
  }
}
