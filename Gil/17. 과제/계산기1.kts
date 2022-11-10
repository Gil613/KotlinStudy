//계산기 1
//- 사칙연산에 대응하는 4개의 함수 구현
//- 연산이 한 번 이루어 질 때 마다 출력을 해야 한다.

class Calculator {
    var result: Int = 0
        set(value){
            field = value
            println("set")
        }
    fun add(number: Int){
        println("fun")
        result += number
    }
    fun subtract(number: Int){
        result -= number
    }
    fun multiple(number: Int){
        result *= number
    }
    fun divide(number: Int){
        result /= number
    }
}

val calculator = Calculator()
//calculator.add(1,2)
//calculator.subtract(5,2)
calculator.add(4)
//calculator.divide(6,2)