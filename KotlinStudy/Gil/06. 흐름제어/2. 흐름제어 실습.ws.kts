var number1: Int = 10

if(number1 == 10){ // -> true
    println("if:true")
}else if(number1 == 20){
    println("else if:true")
}else{
    println("other")
}

var number2: Int = 30
if(number2 == 30) println("number2 is 30")
else if(number2 == 20) println("number2 is 20")
else println("number2 is Nothing")

var number3: Int = if (number2 > 30) 40 else 50
println(number3)




var number4: Int = 5
when(number4){
    5 -> {
        println("number4 is 5")
    }
    6 -> {
        println("number4 is 6")
    }
    else -> {
        println("number4 is Nothing")
    }
}

when(number4){
    5 -> println("number4 is 5")
    6 -> println("number4 is 6")
    else -> println("number4 is Nothing")
}

when(number4){
    in 1..10 -> println("number4 in 1~10")
    in 2..20 -> println("number4 in 11~20")
    }