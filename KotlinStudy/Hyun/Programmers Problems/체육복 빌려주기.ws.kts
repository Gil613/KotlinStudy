//https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=kotlin

var n : Int  = 5
var lost = intArrayOf(2,4)
var reserve = intArrayOf(3)

var people = mutableMapOf<Int, Int>()

for( i in 1..n) {
    if(i in lost){
        people[i] = 0
    }
    else if(i in reserve){
        people[i] = 2
    }
    else {
        people[i] = 1
    }
}
println(people)

for (i in 1.. n-1) {
    if(people[i] == 2 && people[i+1] == 0) {
        people[i] = 1
        people[i+1] = 1
    }

}
for (i in n downTo 2) {
    if(people[i] == 2 && people[i-1] == 0) {
        people[i] = 1
        people[i-1] = 1
    }
}
println(people)
var answer : Int = n
for (i in 1..n) {
    if (people[i] == 0) {
        answer -= 1
    }
}
answer