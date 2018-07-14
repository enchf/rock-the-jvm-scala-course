package lectures.part1basics

object Expressions extends App {
  println(2 + 3 * 4) // Study precedence: + - * / & | ^ << >> >>> (right shift with zero extension)

  // Operators:
  // Boolean: == != < > <= >=
  // Boolean operators: ! && ||
  // Side effect math: += -= *= /=
  // Instructions (Do something) vs Expressions (Give me the value of something)

  // If expression
  val condition = true
  val value = if (condition) 5 else 3 // If is computed and produces a value.
  println(value)

  var i = 0
  val w = while (i < 10) { i += 1 }
  println(w) // () !! -> void / Unit
  println(w.getClass())

  println((i = 100)) // Another example of Unit.

  // While loops are part of 'Imperative programming' (DO NOT USE IN SCALA).
  // In Scala, all is an expression.
  // Side-effects expressions return Unit: while, reassign, println.

  var codeBlock = {
    val y = 2      // Variables shadow outside variables with the same name.
    val z = y + 1
    if (z > 2) "hello" else "goodbye"   // Value of block is the last within it.
  }

  // TEST
  // 1. Difference between "hello world" and println("hello world")
  // 2. What is the value of val x = { 2 < 3 }
  // 3. What is the value of:
  //    val y = {
  //      if (x) 234 else 987
  //      42
  //    }

  println("Hello " + "World")
}
