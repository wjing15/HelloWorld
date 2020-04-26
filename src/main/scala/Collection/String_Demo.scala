package Collection

object String_Demo {

  val num1 = 75
  val num2 = 100.30
  val str1: String = "Hello World"
  val str2: String = " Jack"

  def main(args: Array[String]): Unit = {
    println(str1)
    println(str1.length)
    println(str1.concat(str2))

    val result = printf("(%d -- %f -- %s)", num1, num2, str1)
    val res = s"$str1 -- $num2 -- $str1"
    println(res)
  }
}
