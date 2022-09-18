//정수형
val BYTE: Byte = 10
val SHORT: Short = 10
val INT: Int = 10
val LONG: Long = 10
val DOUBLE: Double = 10.0

//The integer literal does not conform to the expected type Byte
//val WRONGBYTE: Byte = 10000
//Type mismatch: inferred type is String but Byte was expected
//val WRONGBYTE: Byte = "안녕하세요"
//The floating-point literal does not conform to the expected type Float
val FLOAT: Float = 10.0 -> val FLOAT: Float = 10.0F, Float의 경우 할당하련느 값 뒤에 f를 기입해야한다.

//타입추론
val number1 = 10 // = Int
val number2 = 10.0 // = Double

//논리형
val TRUE: Boolean = true
val FALSE: Boolean = false

//문자, 문자열
val CHAR: Char = '가'
val STRING: String = "가나다라"

//Too many characters in a character literal ''가나다라''
//val CHAR: Char = '가나다라'
//Type mismatch: inferred type is String but Char was expected
//val CHAR: Char = "가"
//The character literal does not conform to the expected type String
//val STRING: String = '가나다라'

//Int, Integer
//https://stackoverflow.com/questions/46274888/what-is-the-difference-between-int-and-integer-in-kotlin
//val one: Integer = 1 // error: "The integer literal does not conform to the expected type Integer"
//val two: Integer = Integer(2) // compiles
//val three: Int = Int(3) // does not compile
//val four: Int = 4 // compiles

val four: Any = 4

when(four) {
    is Int -> println("is Int")
    is Integer -> println("is Integer")
    else -> println("is other")
} //prints "is Int"
when(four) {
    is Integer -> println("is Integer")
    is Int -> println("is Int")
    else -> println("is other")
} //prints "is Integer"