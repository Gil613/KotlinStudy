fun addNumbers(a: Int, b: Int): Int{
    return a + b
}

fun mutipleTwoInts(a: Int, b: Int): Int{
    return a * b
}

fun mathFunction(function: (Int, Int)-> Int) {
    val result: Int = function(2,3)
    println("$result")
}

mathFunction(::addNumbers)

val lambda: (Int,Int) -> Int = {
    a, b ->
    a+b
}
mathFunction(lambda)