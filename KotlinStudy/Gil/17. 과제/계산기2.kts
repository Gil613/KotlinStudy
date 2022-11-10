//계산기 2
//- 사칙연산을 할 수 있는 1개의 함수 구현
//- 초기 값을 할당 할 수 있어야 하며 초기 값을 할당 하지 않은 경우에는 0을 기본 값 으로 사용한다.
//- 불가능한 연산을 요청한 경우 "잘못된 연산 입니다"를 출력 한다

class Calcurator(number: Int = 0){
    var init: Int = number
        set(value){
            field = value
            println(init)
        }
        fun ao(str:String, number: Int) {
            if (str.equals("+")) {
                init += number
            } else if (str.equals("-")) {
                init -= number
            } else if (str.equals("/")) {
                init /= number
            } else if (str.equals("*")) {
                init *= number
            }else {
                println("잘못된 계산 방법 입니다.")
            }
        }
}

val calcurator = Calcurator(5)
calcurator.ao("+", 3)


