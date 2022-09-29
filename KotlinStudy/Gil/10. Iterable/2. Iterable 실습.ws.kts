// Range -- 구간
val range1 = 1..10
println(range1) // (1,2,3,4,...10)
val range2 = 1 until 10 // == 1..9
println(range2)
val range3 = 'A'..'Z'
println(range3)

//Progression
val range4 = 1..10 step 2
println(range4) // == (1,3,5,7,9)

val range5 = 10 downTo 1 step 2
println(range5) // == (10, 8, 6, 4, 2)


//Collection
val collection1 = listOf<Int>(1,2,3,4,5)
collection1.asIterable()