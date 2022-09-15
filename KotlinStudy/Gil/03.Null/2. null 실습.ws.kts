//NullAble 선언
val number: Int? = null
println(number)


//Null can not be a value of a non-null type Int
//val number2: Int = null
//println(number2)

val number3: Int? = 3 + 5
val number4: Int? = 10

//Operator call corresponds to a dot-qualified call 'number3.plus(number4)' which is not allowed on a nullable receiver 'number3'.
//Type mismatch: inferred type is Int? but Int was expected
//val number5: Int? = number3 + number4
//println(number5)


val number5: Int = 1 + 5
val number6: Int = 10
val number7: Int = number5 + number6
println(number7)

//변수 선언시 NullAble일때 값이 null일 경우가 존재해 연산이 안된다.
//변수 선언시 NotNull일때 null값을 허용하지 않기 때문에 연산이 가능하다

var number8: Int? = 1+5
var number9: Int? = 10
var number10: Int? = number8!! + number9!!
println(number10)


//null값 비교 연산
if(null == 5){
    println("same")
}else{
    println("not same")
}

if(null == null){
    println("same")
}else{
    println("not same")
}

