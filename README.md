# Scala and Functional Programming | Rock the JVM

A step-by-step guide of the Scala and Functional Programming course (Rock the JVM).

## 1. Getting Started!

- To create a new Scala project, use the IDEA - based Scala project:

  ![createScalaProjectStep1](images/createScalaProjectStep1.png)
  ![createScalaProjectStep2](images/createScalaProjectStep2.png)

- To add the Scala plugin, use the Marketplace tab to browse and install it.

  ![scalaPlugin](images/scalaPlugin.png)

- To add the Scala library to an existing project, add it in the Project Structure:

  ![scalaLibrary](images/scalaLibrary.png)

## 2. The Absolute Scala Basics

### 2.1. Values, Variables and Types
- Values: Immutable with a name and type (can be inferred).
- Variables: Mutable.
- Prefer als over vars.
- All vals and vars have types.
- Compiler automatically infers types when omitted.
- Basic types: Boolean, Int, Long, Double, String.

### 2.2. Expressions
- Everything in Scala is an expression: operators, ifs, code blocks,...
- The value of the code block is the value of its last expression.
- Instructions are executed (like in Java), expressions are evaluated (Scala).

### 2.3. Functions
- When you need loops, use recursion (No imperative code!).

### 2.4. Recursion
- When you need loops, use tail recursion.
- You need as many accumulators as recursive calls you have in a tail recursive function.

### 2.5. Call by Value Vs Call by Name
- Call by value:
  - Value is computed before the call;
  - Same value used everywhere.
- Call by name:
  - Expression is passed literally;
  - Expression is evaluated every time/use.

### 2.6. Default and Named Arguments
- You can set default values, and omitted them when the function is called.
- You cannot omit leading default values, unless you name them (even in a different order).  

### 2.7. Smart Operations on Strings
- For formatted strings, similar to printf, you will expand the value with the expected format, e.g. %2.2f will be 2 
  characters total and 2 decimals precision.  
- The raw interpolator performs no escaping of literals within the string.

## 3. Object-Oriented Programming in Scala

### 3.1. OOP Basics
- Defining a class with parameters (constructor) and methods (functions/def).
- Instantiating a class with the keyword 'new'.
- A class parameter can become a class field with the keyword 'val'.

### 3.2. Method Notations
- **Infix/operator** and **Postfix** notations are syntactic sugar that only works with methods with single parameters: 
  - Infix:
      - mary.likes("Inception") == mary likes "Inception".
      - mary.+(tom) == mary + tom
  - Postfix:
      - mare.isAlive == mary isAlive
- **Prefix** notation is another syntactic sugar about unary operators (unary_) that only works with **- + ~ !**
  - 1.unary_- == -1
  - You must leave a whitespace between the unary operator and the colon, otherwise it would include it as part of it:
    - `def unary_! : String = s"$name, what the heck?!"`
- All operators are methods: 1 + 2 == 1.+(2)
- **Apply** is a method that Scala delegates when a class is call as a method:
  - `def apply(): String = s"Hi, my name is $name and I like $favoriteMovie"`
  - mary.apply() == mary()

### 3.3. Scala Objects
- In OOP, class-level functionality is the one that doesn't depend on the instance of a class.
- Scala does NOT have class-level functionality ("static"). It has something, even better, called Scala Object that has a 
  static-like functionality.
- Scala objects can have val, vars and methods but do not receive parameters. 
- Scala objects are singleton instance by definition (type + its only instance):
  ```scala
    object Person { val N_EYES = 2 }
    val mary = Person
    val john = Person
    println(mary == john) // true
  ```
- **Companions** is a pattern used to name object and class equally in the same scope.
- **Scala applications** are Scala objects with:
  - the main method: `def main(args: Array[String]): Unit`
  - or extending the App type: `object MyApp extends App`