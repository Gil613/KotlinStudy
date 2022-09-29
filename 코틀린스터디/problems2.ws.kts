fun numberOne(n: Int, letter : String) {
    for(i in 1..n){
        println(letter)
    }
}
numberOne(3,"안녕하세요?")

fun numberTwo(n : Int) : Int {
    var sum : Int = 0
    for(i in 1..n) {
        sum += i
    }
    return sum
}
numberTwo(10)

fun numberThree() : Int {
    var sum : Int = 0
    for (i in 1..100) {
        if (i % 7 == 0) {
            sum += i
        }
    }
    return sum
}
numberThree()

fun numberFour(n : Int) {
    if (n >= 100) {
        println("less than 100")
    }
    else {
        var k = n
        while(k < 100) {
            k += 1
        }
        println(k)
    }
}

numberFour(4)

fun numberFive(nArr : Array<Int>) : List<Boolean> {
    var result = mutableListOf<Boolean>()
    for (i in 0..nArr.size-1) {
        if (nArr[i] >= 80) {
            result.add(true)
        }
        else {
            result.add(false)
        }
    }
    return result
}

val testResult : Array<Int> = arrayOf(70,71,72,77,78,79,80,82,90,99)
numberFive(testResult)

fun numberSix() {
    var basket = mutableListOf<List<Int>>()
    for(i in 1..3) {
        val ball = mutableListOf<Int>(i,6-i)
        basket.add(ball)
    }
    println(basket)

}
numberSix()

fun numberSeven(total : Int, current : Int) {
    var t = total
    var c = current
    while (t > c) {
        c += 1
        println("밥을 먹었다")
    }
    println("배가 부르다")
}
numberSeven(4,2)

fun numberEight(first : List<String>, second : List<String>, n : Int) : List<List<String>>? {
    var f = mutableListOf<String>()
    var s = mutableListOf<String>()
    var result = mutableListOf<List<String>>()
    for (i in 0..first.size-1) {
        f.add(first[i])
    }
    for (i in 0..second.size-1) {
        s.add(second[i])
    }
    if (n >= f.size || n >= s.size) {
        return null
    }
    else {
        f.removeAt(n)
        s.removeAt(n)
        result.add(f)
        result.add(s)
        return result
    }
}

val first = listOf("A","B","C","D")
val second = listOf("A","B","C")
numberEight(first, second,100)

fun numberNine(n : Int) :List<Int> {
    var list = mutableListOf<Int>()
    for (i in 1..9) {
        list.add(n*i)
    }
    return list
}
numberNine(3)

fun numberTen(first : List<Int>, second : List<Int>) : Map<Int, String> {
    var map = mutableMapOf<Int, String>()
    for (i in 0..first.size-1) {
        if (first[i] % 2 == 0) {
            map[first[i]] = "짝수"
        }
        else {
            map[first[i]] = "홀수"
        }
    }
    for (i in 0..second.size-1) {
        if (second[i] % 2 == 0) {
            map[second[i]] = "짝수"
        }
        else {
            map[second[i]] = "홀수"
        }
    }
    return map
}
val list1 = listOf<Int>(1,2,3,4,5,6,7,8,9)
val list2 = listOf<Int>(1,3,4,7,8,9,10)
numberTen(list1, list2)
