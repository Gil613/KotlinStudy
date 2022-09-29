// a가 10이면 'same', a가 10보다 작으면 'small', 크면 'big' 출력
fun ifPrint() {
    var a = 5

    if (a == 10) {
        println("same")
    } else if (a < 10) {
        println("small")
    } else {
        println("big")
    }
    // 간결하게 해보기
    // var result = if (a == 10) "same" else if (a < 10) "small" else "big"
}

fun whenPrint() {
    var number: Int = 15
    when(number) {
        5 -> {
            println("number is 5")
        }
        else -> {
            println("number is ${number}")
        }
    }

    when(number) {
        in 1..10 -> println("number in 1~10")
        in 11..20 -> println("number in 11~20")
    }
}

// 배열
fun arrayPrint() {
    var array = arrayOf(true, 10, "Hi")
    array.set(0, 100)

    array.forEach { println(it) } // 데이터 값을 각 줄마다 출력
    println(array.contentToString()) // 배열 형태로 출력
}

// collection
fun collection() {
    // List
    // Immutable(불변), lisftOf<자료형>(값...)
    val fruits = listOf<String>("apple", "banana", "kiwi", "peach")
    println("fruits.size : ${fruits.size}")
    println("fruits.get(2) : ${fruits.get(2)}")
    println("fruits[3] : ${fruits[3]}")
    println("fruits.indexOf(\"peach\") : ${fruits.indexOf("peach")}")
    println()

    // Mutable(가변), mutableListOf<String>(값...)
    val vegetables = mutableListOf<String>("carrot", "tomato", "onion", "corn")
    vegetables.remove("onion")
    vegetables.add("cucumber")
    println("vegetables : $vegetables")

    vegetables.addAll(listOf("pumpkin", "cabbage"))
    println("vegetables : $vegetables")
    vegetables.removeAt(3)
    println("vegetables : $vegetables")


    // Set
    // Immutable(불변), setOf<자료형>(값...)
    val numbers = setOf<Int> (11, 22, 33, 44, 55)
    println(numbers)
    println("numbers.size : ${numbers.size}")
    println("numbers.contains(1) : ${numbers.contains(1)}")
    println("numbers.isEmpty() : ${numbers.isEmpty()}")

    // Mutable(가변), mutableSetOf<자료형>(값...)
    val nums = mutableSetOf<Int>(1, 2, 3, 4, 5)
    println(nums)
    nums.add(10)
    nums.remove(3)
    println(nums)
    nums.removeIf({ it < 3 }) // 3이하 숫자 삭제
    println(nums)


    // Map key와 value를 짝지어 저장
    // Immutable(붋변), mapOf<key 자료형, value 자료형>(값...)
    val numberMap = mapOf<String, String>(
        "1" to "one", "2" to "two", "3" to "three"
    )
    println("numbersMap : $numberMap")

    val numberMap2 = mapOf(Pair("1", "one"), Pair("2", "two"), Pair("3", "three"))
    println("numberMap2 : $numberMap2")

    // Mutable(가변), mutableMapOf<key 자료형, value 자료형>(값...)
    // 객체 추가는 put(), 삭제는 remove(), 전체삭제 clear()
    val numberMap3 = mutableMapOf<String, String>(
        "1" to "one", "2" to "two", "3" to "three"
    )
    println("numberMap3 : $numberMap3")

    numberMap3.put("4", "four")
    numberMap3["5"] = "five"
    println("numberMap3 : $numberMap3")

    numberMap3.remove("1")
    println("numberMap3 : $numberMap3")

    numberMap3.clear()
    println("numbeMap3 : $numberMap3")
}