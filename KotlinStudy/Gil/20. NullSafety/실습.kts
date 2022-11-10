//// ? -> nullable
//val number: Int = 10
//val number: Int? = null
//
//// !! -> NotNull , 정말 확실한 경우에만 사용한다.
//val nullableNumberList: List<Int?> = listOf<Int?>(1,2,3)
//var result: Int = 0
//
//nullableNumberList.forEach{
//    result += it!!
//}
//println(result)

// ?. -> nullable
//val text: String? = null
//val nullText: Int? = text?.length
//
//if(nullText == null){
//    println("널")
//}

// as? -> safeCasting
//open class Warrior(var power: Int){
//    fun attack(){
//        println("공격")
//    }
//}
//
//class DefenceWarrior(){
//    fun defence(){
//        println("방어")
//    }
//}
//
//val defenceWarrior = DefenceWarrior()
//val warrior = defenceWarrior as? Warrior
//println(warrior)


//?: 엘비스 연산 null이 아니면 ?: 의 왼쪽 값을 아니면 오른쪽 값을 넣겠다
//val text: String = "123"
//val nullText: String? = null
////같은 내용을 엘비스 연산을 사용
////var len1: Int = if(text != null) text.length else 0
//var len2: Int = nullText?.length ?: 0
//println(len2)
