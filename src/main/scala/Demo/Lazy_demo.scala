package Demo

class Lazy_demo {
  lazy val l = {
    println("lazy")
    9
  }
}

class Strict {
  val e = {
    println("strict")
    9
  }
}


object Lazy_demo{
  def main(args: Array[String]): Unit = {
    val x = new Strict
    val y = new Lazy_demo

    println(x.e)
    println(y.l)
  }
}