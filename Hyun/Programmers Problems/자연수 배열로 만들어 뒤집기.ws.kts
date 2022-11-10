//
var n : Int = 12345
var nToString : String = n.toString()
var nList = nToString.chunked(1)
var answer = mutableListOf<Int>()
println(nList)

for (i in (nList.size-1) downTo 0) {
    answer.add(nList[i].toInt())
}
println(answer)