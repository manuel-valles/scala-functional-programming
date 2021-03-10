package lectures.part1basics

object Expressions extends App{

  val x = 1 + 2  // Expression (right side)
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ... Side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (value)

  // IF Expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)

  // EVERYTHING in Scala is an Expression!

  val aWeirdValue = (aVariable = 3) // Unit === void (doesn't return anything)
  println(aWeirdValue) // ()

  // Side effects: println(), whiles, reassigning

  // Code blocks - their values is available only inside it
  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z>2) "hello" else "goodbye"
  }

  // 1. Difference between "hello world" and println("hello world")
  // The first one is a value of type String (String) and the second one is a Unit expression with side effects
  // (printing it to the console)

  // 2.
  val someValue = {
    2 < 3
  }
  println(someValue) // true

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue) // 42

}
