//배열 선언 방법
var array1 = arrayOf(true, 10, "hi")
var array2 = arrayOf<Int?>(1,2,3,4,5,null)
println(array2)
var array3 = intArrayOf(1,2,3,4,5)

var array4 = Array(10,{0})

var array5 = IntArray(10,{0})

var array6 = Array<Int>(10,{0})

var array7 = Array<String>(10,{"a"})

var array8 = arrayOf<String>("")


//배열에 값 넣고 빼기
val score1: Int = 100
val score2: Int = 90
val score3: Int = 80
var examScores = arrayOf<Int>(score1, score2, score3)
var examScores1 = Array<Int>(3,{0})

val score5: Int = 50
examScores[0] = score5
examScores.contentToString()
val score4 = examScores[0]
println(score4)

examScores1[0] = score1
examScores1[1] = score2
examScores1[2] = score3
println(examScores1[0])