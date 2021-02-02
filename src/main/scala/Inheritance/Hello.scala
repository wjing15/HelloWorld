package Inheritance

abstract class NCLH {
  def brand: String
  def competitor: String
}

object ncl extends NCLH {
   def brand: String = "NCL, RSS, OCIEANA"
   def competitor: String = "RCL, CCL"
}

object Hello{
  def main(args: Array[String]): Unit = {
    println("Hello World")
  }

  def error(msg: String) = throw new Error(msg)
  error("test")

  if(true) 1 else false
}
