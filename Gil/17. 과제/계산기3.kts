//계산기 3
//- 사칙연산을 할 수 잇는 1개의 함수 구현
//- 한 번에 여러가지의 연산을 입력 받을 수 있어야 한다.
// 리스트 두 개를 만들어 ['+','-','*','/'],[숫자]
class Calcurator{
    var init: Int = 0

    fun ao(ao: List<Char>, number: List<Int>){
        ao.forEachIndexed{ index, ao1 ->
         _ao(number[index],ao1)
            println(init)
        }
    }

    //_가 붙은 함수는 클래스 내부에서만 사용하기로 한 암묵적 룰
    fun _ao(number: Int, str:Char){
        when(str){
            '+' -> init += number
            '-' -> init -= number
            '/' -> init /= number
            '*' -> init *= number
            else -> println("잘못된 계산 방법 입니다.")
        }
    }
}

val calcurator = Calcurator()
calcurator.init = 100
calcurator.ao(listOf<Char>('/','*','-','+'),listOf<Int>(10,20,100,50))