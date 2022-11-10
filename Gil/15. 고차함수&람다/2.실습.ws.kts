fun addTwoNumbers(number1: Int, number2: Int): Int{
    return number1 + number2
}
fun addTwoNumbers2(number1: Int,number2: Int): Int{
    number1+number2
}

addTwoNumbers2(10,9)

fun addTenNine(function: (Int, Int) -> Int){
    val result: Int = function(10,9)
    println("결과는 $result 입니다")
}

addTenNine(::addTwoNumbers)


val addTenNine2: (Int, Int)-> Int = {
    number1: Int, number2: Int ->
    number1 + number2
}

addTenNine(addTenNine2)

//데이터 타입 생략
val addTenNine3: (Int, Int)-> Int = {
        number1, number2 ->
    number1 + number2
}

addTenNine(addTenNine3)

//
val addTenNine4 = {
        number1: Int, number2: Int ->
    number1 + number2
}

addTenNine(addTenNine4)

addTenNine{
    number1, number2 -> number1 + number2
}

val addTenNine5: () -> Int = {
    10+9
}

addTenNine6()


