//https://school.programmers.co.kr/learn/courses/30/lessons/12944?language=kotlin


var list = mutableListOf<Int>(1,2,3,4)
var sum : Double = 0.0
for(i in list) {
    sum += i
}

sum = sum / (list.size)
println(sum)

