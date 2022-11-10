// for문 형태
for (value in 0..3){
    println("반복")
}

//Progression
for(value in 0..5 step 2){
    println("2구간 반복" + value )
}

for(value in 5 downTo 0){
    println("5 downTo 0 반복" + value)
}


// Iterator
val numbers = listOf<Int>(11,52,33,64)

for(number in numbers){
    println(number)
}

for(i in 0..numbers.size){
    println("반복3")
}

for(i in 0 until numbers.size){ //0..3
    println("반복4")
}

for((index, number) in numbers.withIndex()){
    println(" " + index + " -> " + number)
}


//forEach
numbers.forEach {
    println(it)
}
numbers.forEach { number ->
    println(number)
}


//while
var i = 0
while(i < numbers.size ){
    i++
    println("while문")
}

var z = 10
do{
    println("Do it" + z)
    z++
}while(z<20)


//break

for(i in 1..10){
    loop@for(j in 1..3){

        if(i > 5) {
            println("if : i = " + i + ", j = " + j)
            break@loop
        }else{
            println("else : i = " + i + ", j = " + j)
        }

    }
}