//interface Tiger{
//    fun bite()
//    fun goToBox()
//}
//
//class KingTiger: Tiger{
//    override fun bite() {
//        TODO("Not yet implemented")
//    }
//
//    override fun goToBox() {
//        TODO("Not yet implemented")
//    }
//}
//
//val kingTiger: KingTiger = KingTiger()
//
//kingTiger.bite()
//kingTiger.goToBox()

interface Person{
    //멤법들의 구현부가 없다.
    var dress: String
    fun eat()
    fun sleep(){
        println("수면")
    }
}

class Student: Person{
    override var dress: String
        get() = "교복"
        set(value) {}

    override fun eat() {
        println("식사")
    }

    fun study(){
        println("공부")
    }

}

class GoodStudent: Student(){

}

class Teacher: Person{
    override var dress: String
        get() = "정장"
        set(value) {}

    override fun eat() {
        println("식사")
    }

}

val student: Student = Student()
student.eat()
student.sleep()

val teacher: Teacher = Teacher()

teacher.sleep()