fun plusNumbers(firstNum: Int, secondNum: Int): Int {

    val result: Int = firstNum + secondNum
    return result
}

plusNumbers(2, 3)

var result: Int = plusNumbers(2, 4)

println(result)

//기본값이 있는 함수 선언
fun plusNumbersWithDefault(firstNum: Int, secondNum: Int = 10): Int {
    return firstNum + secondNum
}

var result2 = plusNumbersWithDefault(10)

println(result2)

//반환 값이 없는 함수
fun plusNumberWithNoReturn(firstNum: Int, secondNum: Int): Unit {
    var result5: Int = firstNum + secondNum
    println(result5)
}

fun plusNumberWithNoReturn2(firstNum: Int, secondNum: Int) {
    var result5: Int = firstNum + secondNum
    println(result5)
}

fun plusNumberWithNoReturn3(firstNum: Int, secondNum: Int) {
    var result5: Int = firstNum + secondNum
    println(result5)
    return
}

plusNumberWithNoReturn(2, 3)
plusNumberWithNoReturn2(2, 3)
plusNumberWithNoReturn3(2, 3)


//함수 선언을 간단하게 하는 방법
fun shortPlusNumbers(firstNum: Int, secondNum: Int) = firstNum + secondNum
shortPlusNumbers(1, 6)

//가변인자를 갖는 함수
fun plusMultipleNumbers(vararg numbers: Int): Unit {
    //numbers에 들어온 값들을 하나하나 돌면서 println을 진행한다.
    for (number in numbers) {
        println(number)
    }
}

plusMultipleNumbers(1,2,3,4,5)