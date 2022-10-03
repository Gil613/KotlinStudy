//https://school.programmers.co.kr/learn/courses/30/lessons/12934


import kotlin.math.pow
import kotlin.math.sqrt

var n : Long = 100

var nSqrt : Double = sqrt(n.toDouble())

if (nSqrt % 1.0 == 0.0) {
    nSqrt += 1.0
    nSqrt = nSqrt.pow(2)
    println(nSqrt.toInt())
}
else {
    println(-1)
}