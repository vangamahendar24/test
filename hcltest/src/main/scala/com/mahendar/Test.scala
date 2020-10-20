package com.mahendar

import java.lang.Math

class Test {

  def printNumbers(n:Int) ={
    for(i <- 1 to n){
      println(i)
    }
  }

  def findAreOfTriangle(a:Int,b:Int,c:Int):Double = {
    // Length of any side must be positive integer and sum of any two sides must be smaller than third side.
    if (a < 0 || b < 0 || c <0 || (a+b <= c) || a+c <=b || b+c <=a)
    {
      System.out.println("Not a valid triangle");
      System.exit(0);
    }
    val s:Double = (a+b+c)/2;
    Math.sqrt(s*(s-a)*(s-b)*(s-c));
  }
}
