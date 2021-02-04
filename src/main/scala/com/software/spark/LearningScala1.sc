// VALUES ARE IMMUTABLE constants
val hello: String = "Hola!"

//VARIABLES are mutable
var helloThere: String = hello
helloThere = hello + " There!"
println(helloThere)

//Scala is centered around the idea of passing functions around and potentially
//running them in parallel. That's why its a good match for Apache Spark
//The reason which we want to stick with immutable constants are is to avoid a bunch of thread safety issues

val immutableHelloThere = hello + " There"
println(immutableHelloThere)

//Data Types

val numberOne: Int = 1
val truth: Boolean = true
val letterA: Char = 'a'
val pi: Double = 3.14159265
val piSinglePrecision : Float = 3.14159265f
val bigNumber: Long = 123456789
val smallNumber: Byte = 127

println("Here is a mess:" + numberOne + truth + letterA + pi + bigNumber)

println(f"Pi is about $piSinglePrecision%.3f")
println(f"Zero padding on the left: $numberOne%05d")

println(s"I can use the s prefix to use variables like $numberOne $truth")

println(s"Can include expression ${1+3}")

val theUltimateAnswer: String = "To life, the universe, and everything is 42."
val pattern = """.* ([\d]+).*""".r
val pattern(answerString) = theUltimateAnswer
val answer = answerString.toInt
println(answer)

//Booleans
val isGreater = 1 > 2
val isLesser = 1 < 2
val impossible = isGreater & isLesser
val anotherWay = isGreater && isLesser

val picard: String = "Picard"
val bestCaptain: String = "Picard"
val isBest: Boolean = picard == bestCaptain //comparing values