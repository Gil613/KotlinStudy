//1. 변수 A와 B를 선언하고, 두 변수의 값이 같은 경우에는 true, 그렇지 않은 경우에는 false가 되는  변수 C를 선언한다
//        단 변수 A와 B의 자료형은 자유이지만 에러가 발생하면 안된다.
var A: Int = 1
var B: Int = 2
var C: Boolean = true

if (A == B) {
    C
    println(C)
} else {
    C = false
    println(C)
}

//2. 정수형 변수 A를 선언하고, 변수 B를 선언 한다 이때 변수 B는 A의 두배가 되어야 한다.
var A1: Int = 1
var B1: Int = A1 * 2
println(A1)
println(B1)

//3. 학생의 시험 점수를 넣어주면 학점을 반환하는 함수를 만드시오
//        (90점 이상 A학점, 80~89점은 B학점, 70~79점은 C학점, 그렇지 않으면 F학점)

fun gradeCheck(score: Int): String {
    var grade: String = "F"

    when (score) {
        in 70..79 -> grade = "C"
        in 80..89 -> grade = "B"
        //Incompatible types: Boolean and Int
        //score >= 90 -> grade = "A"
    }
    if (score >= 90) grade = "A"
    return grade
}

gradeCheck(90)
//4. 학생이 시험에서 맞은 문제의 갯수를 넣어주면 시험 점수(정수)를 반환하는 함수를 만드시오
//(시험 문제는 총 20문제이고 만점은 100점)
fun scoreCalculator(correctQty: Int): Int {

    if (correctQty > 20) {
        println("총 문제 수 보다 더 많이 입력되었습니다.")
        return 0
    }

    return correctQty * 5
}

scoreCalculator(20)


//5. nullable 정수형 두개를 받는 함수를 만든다. 이 함수는 받은 인수의 합을 반환한다.
//이때 인수중에 null이 있으면 0으로 취급하여 합을 구한다다

fun sumNumbers(number1: Int?, number2: Int?): Int {
    if (number1 == null || number2 == null) {
        return 0;
    } else {
        return number1 + number2
    }
}

sumNumbers(1, null)