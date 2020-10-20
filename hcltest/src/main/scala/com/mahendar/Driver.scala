package com.mahendar

object Driver {
  def main(args:Array[String]): Unit ={
    println("Printing 10 numbers")
    val obj = new Test
    obj.printNumbers(10)

    println("finding area of triangle")
    val area = obj.findAreOfTriangle(4,5,7)
    println("Area of triangle is:"+area)
  }

}
