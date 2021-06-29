package OOO.basics

import scala.io.StdIn.{readInt, readLine}
// 13/195
object Libraries extends App {
  println("What is your name?")
  val name = readLine()
  println("How old are you?")
  val age = readInt()

  println(s"Hi, $name, your age is $age")


}
