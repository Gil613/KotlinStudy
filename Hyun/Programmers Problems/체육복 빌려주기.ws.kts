//https://school.programmers.co.kr/learn/courses/30/lessons/42862?language=kotlin

var n : Int  = 5
var lost = intArrayOf(1,2,4,5)
var reserve = intArrayOf(2,3,4)

var people = mutableMapOf<Int, Int>()

for( i in 1..n) {
    if(lost.contains(i) && reserve.contains(i)){
        people[i] = 1
    }
    if(lost.contains(i) == false && reserve.contains(i)){
        people[i] = 2
    }

    if(lost.contains(i) == false && reserve.contains(i) == false){
        people[i] = 1
    }
    if(lost.contains(i) && reserve.contains(i) == false) {
        people[i] = 0
    }

}

println(people)
if(people[1] == 2 && people[2] == 0) {
    people[1] = 1
    people[2] = 1
}
for (i in 2..n-1) {
    if (people[i] == 2) {
        if(people[i-1] == 0 && people[i+1] == 0) {
            people[i] = 1
            people[i-1] = 1
        }
        else if(people[i-1] == 0 && people[i+1] != 0) {
            people[i] = 1
            people[i-1] = 1
        }
        else if(people[i+1] == 0 && people[i-1] != 0) {
            people[i] = 1
            people[i+1] = 1
        }
    }
}

if(people[n] == 2 && people[n-1] == 0) {
    people[n] = 1
    people[n-1] = 1
}
println(people)
var answer : Int = n
for (i in 1..n) {
    if (people[i] == 0) {
        answer -= 1
    }
}
answer