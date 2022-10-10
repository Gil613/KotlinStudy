//1. 주어진 문자를 N번 반복해서 출력하는 함수를 만들어 보자
//    fun repeatWord(word: String, repeatNum: Int){
//        for (i in 0..repeatNum - 1) println(word)
//        for (i in 1..repeatNum) println(word)
//        for (i in 0 until repeatNum) println(word)
//        for(number in repeatNum downTo 1) {
//                println(word)
//            }
//    }
//
//    repeatWord("Hi", 5)



//        2. 1부터 주어진 숫자까지의 합을 구하는 함수를 만들어 보자
//fun sum(num: Int): Int{
////var sum: Int = 0
////for(i in 1..num) sum += i
////return sum
//    var result = 0
//    var number = num
//    result = (number * (number+1)) / 2
//
//    return result
//}
//sum(11)


//3. 1부터 100까지의 수중에서 7의 배수의 합을 구하는 함수를 만드시오
//fun multipleOf7(): Int {
//
//    var result = 0
//
//    for (num in 1..100) {
//        if(num % 7 == 0) result += num
//    }
//    return result
//}
//
//multipleOf7()

//4. 100 보다 작은 숫자를 넣어주면, 1씩 증가를 시키고 100 이 되면 종료되는 함수를 만드시오
//fun plus(num: Int){
//    var cnt = 0
//    var initNum = num
//    while(initNum < 100){
//        initNum++
//        println("더한 횟 수" + " " + ++cnt)
//    }
//    println(initNum)
//}
//
//plus(90)

//        5. 시험 성적 리스트 [70,71,72,77,78,79,80,82,90,99]
//와 동일한 크기의 배열을 만들고, 합격이면 true, 불합격이면 false를 담는 함수를 만드시오
//(80점 이상 부터 합격, 정답 예시 (False,False,...))
//fun testResultList(testResult: List<Int>): BooleanArray{
//    var result = BooleanArray(testResult.size,{false})
//    testResult.forEachIndexed { index, score ->
//        if(score >= 80) result[index] = true
//        println("index: ${index}, value : ${score}")
//    }
//    return result
//}
//val result = testResultList(listOf<Int>(70,71,72,77,78,79,80,82,90,99))
//result.forEach {
//    println(it)
//}

//6. 두개의 주사위를 던졌을때, 눈의 합이 6이 되는 모든 경우의 수를 출력하는 함수를 만드시오
//-> [[3,3],[1,5],...]
//fun findDiceSumIsSix(): List<List<Int>>{
//    var resultList = mutableListOf<List<Int>>()
//    for(i in 1..6){
//        for( j in 1..6){
//            if(i + j == 6){
//                resultList.add(ListOf<Int>(i, j))
//            }
//        }
//    }
//    return resultList
//}
//
//println(findDiceSumIsSix())


//7. 배부르기 위해서 먹어야하는 총 밥먹기 횟수, 현재 밥먹은 횟수, 두개를 받는 함수를 만드시오
//        함수는 "밥을 먹었다" 한번 출력을 할때 마다 밥을 1회 먹은 것으로 간주를 하고,
//배가 부를 때까지 밥을 먹여야 한다
//        배가 부를 경우에는 "배가 부르다" 를 출력한다
//배가 아무리 불러도 최소 한번은 무조건먹는다
//fun eat(3,2):{}
//->"밥을 먹었다"
//->"배가 부르다"




//8. 병사 그룹 2개와 n번째 값을 넣어주면, 각각의 병사 그룹에서 n번째 병사를 제거하고, 두개의 병사
//        그룹을 합쳐주는 함수를 만드시오

//fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 2)
//-> [["A", "B", "D", "E"], ["A", "B"]]
//
//(합수 실행이 어려운 조건을 만나면 null을 리턴해야한다)
//fun abc( ["A", "B", "C", ,"D", "E"] ,  ["A", "B", "C"], 100)
//-> null
//





//9. 단수를 입력 받아 해당 단수의 값을 리스트로 출력하는 함수를 만드시오
//fun abc(3)
//->[3,6,9,12,15,18,21,24,27]
//


//10. 숫자 리스트 두개를 넣어주면 짝수 홀수로 분리된 Map을 만드는 함수를 만드시오
//(Map의 키는 짝수의 경우 "짝수", 홀수의 경우 "홀수" 한다)
fun abc(num1: List<Int>, num2: List<Int>):HashMap<String, List<Int>>{
    var hashMap = HashMap<String, List<Int>>()
    var index =
        num1.forEachIndexed { index, i ->
            if(num1[index] % 2 == 0) hashMap.put("짝수", i)
            if(num1[index] % 2 != 0) hashMap.put("홀수", i)
        }
        num2.forEachIndexed { index, i ->
            if(num2[index] % 2 == 0) hashMap.put("짝수", i)
            if(num2[index] % 2 != 0) hashMap.put("홀수", i)
        }
    return hashMap
}

val list1 = listOf<Int>(1,2,3,4,5,6)
val list2 = listOf<Int>(7,8,9,10,11,12)
var result = abc(list1, list2)
result.forEach {
    println(it)
}



//땡땡땡.기능()
//-> 을 사용해 하는 경우가 있을수 있습니다
//-> 기능을 사용하는 방법은 이전 강의에서 알려드렸지만, .문법은 클래스 강의 이후에 이해가 가능합니다.
//-> 과제에서는 이해는 미뤄두고 우선 사용해주세요ㅠ