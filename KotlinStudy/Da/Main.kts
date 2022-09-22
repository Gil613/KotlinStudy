//1번
fun main() {
    val A: Int = 1
    val B: Int = 2
    val C : Boolean = true

    if (A == B) {
        C
    } else {
        C = false
    }
}


//2번
fun main() {
    var A : Int = 2
    var B : Int = A * 2
}

//3
import java.util.*

fun main() {
    var score = Scanner(System.`in`)

    getGrade(score.nextInt())
}

fun getGrade(score : Int) {
    if (score >= 90) {
        println("A학점")
    } else if (score >= 80) {
        println("B학점")
    } else if (score >= 70) {
        println("C학점")
    } else {
        println("F학점")
    }
}