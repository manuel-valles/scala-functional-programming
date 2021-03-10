package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  println(x)
  // Vals are immutable
  // Compiler can infer types => val x = 42 (works!)

  // Types:
  val aString: String = "hello"
  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val aShort: Short = 4619
  val aLong: Long = 11223344556L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // Variables:
  var aVariable: Int = 4
  aVariable = 5 // Side effects

  // Prefer vals over vars
}
