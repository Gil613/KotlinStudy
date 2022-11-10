// https://school.programmers.co.kr/learn/courses/30/lessons/12931

var n : Int = 123
var nToString : String = n.toString()
var nArray = nToString.chunked(1)
var answer : Int = 0
for (i in nArray) {
    var tInt = i.toInt()
    answer += tInt
}
println(answer)