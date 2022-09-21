//Problem 1
var a : Int = 5
var b : Int = 5
//var b : Int = 7
var c : Boolean = true

if (a!==b) {
    c = false
}
println(c)

//Problem 2
var d : Int = 3
var e : Int = d*2
println(e)

fun score(x : Int) = when  {
    x >= 90 -> 'A'
    x >= 80 -> 'B'
    x >= 70 -> 'C'
    else -> 'F'
}
println(score(90))
println(score(85))
println(score(70))
println(score(60))

fun WriteOrWrong(x:Int) : Int {
    return x * 5
}

WriteOrWrong(10)

fun nullplus(x : Int? , y : Int?) : Int? {
    if (x==null || y == null) {
        return null
    }
    else {
        return x!! + y!!
    }

}

nullplus(3,4)
println(nullplus(null, 4))


var n : Int = 123

var nToString : String = n.toString()

println(nToString)