/**
  * Created by Fraser on 06/06/2017.
  */

object Main {
  def tooHot(temperature : Int, isSummer : Boolean) : Boolean = isSummer match{
    case x if !isSummer && temperature == 80 => true
    case x if isSummer && temperature == 100 => true
    case _ => false
  }

  def main(args : Array[String]) : Unit = {
    val summer : Boolean = true
    val notSummer : Boolean = false
    println("Input(80,false) -> " + tooHot(80, notSummer))
    println("Input(100,false) -> " + tooHot(100, notSummer))
    println("Input(100,false) -> " + tooHot(100, summer))
  }
}
