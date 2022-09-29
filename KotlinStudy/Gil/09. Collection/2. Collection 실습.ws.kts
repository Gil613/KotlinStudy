// List

val list1 = listOf<Int>(1,2,3)

//Unresolved reference. None of the following candidates is applicable because of receiver type mismatch:
//public inline operator fun kotlin.text.StringBuilder /* = java.lang.StringBuilder */.set(index: Int, value: Char): Unit defined in kotlin.text
//No set method providing array access
//list1[0] = 3
//println(list1[0])

val list2 = mutableListOf<Int>(0,2,3)
list2[0] = 3
println(list2[0])
list2.removeAt(0)
println(list2[0])


//Set
val set1 = setOf<Int>(1,2,3,3,2,1)
println(set1)

var a:Int = 0
var set2 = mutableSetOf<Int>(1,2,3,1,1,2)
if(set2.add(4) == true) a = 1 else a = 0
println(set2)
set2.add(4)
set2.remove(4)
println(set2)

//Map
val map1 = mapOf<Int, String>(1 to "1", 2 to "2")
println(map1)

val map2 = mutableMapOf<Int, String>(Pair(1,"1"), Pair(2,"2"),Pair(2,"2"))
println(map2)
map2.put(3,"3")
println(map2)
map2[3] = "4"
println(map2)
map2.remove(3)
println(map2)