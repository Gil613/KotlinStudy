import java.lang.Exception

val numbers = listOf<Int>(1,2,3)
try {
    numbers.get(5)
}catch(exception: Exception){
    println(exception)
}

try{
    numbers.get(5)
}catch(exception1: IllegalAccessException){
   println(exception1)
} catch(exception: ArrayIndexOutOfBoundsException){
    println("INDEX추가")
}finally{
    println("마침내")
}
