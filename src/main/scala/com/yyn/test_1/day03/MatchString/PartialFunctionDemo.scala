package com.yyn.test_1.day03.MatchString

/**
  * 偏函数 属于模式匹配的一种
  */
object PartialFunctionDemo {

  def m1(num:String):Int=num match {
    case "one"=>1
    case "two"=>2
    case _=> -1
  }

  def m2:PartialFunction[String,Int] ={
    case "one"=>{
      println("case one")
      1
    }
    case "two"=>{
      println("case two")
      2
    }
    case _=>{
      println("case no")
      1
    }
  }

  def main(args: Array[String]): Unit = {
    println(m2("one"))
  }

}
