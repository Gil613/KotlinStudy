// 클래스 선언 방법
//class Person{}


// 주생성자
//User1이라는 클래스를 통해서 객체를 만들어야 할때 넣어줘야 할(name: String)
class User1 constructor(name: String){
    val userName: String // 클래스 속성 (property)은 init블럭에서 초기화 된다.
    //초기화 블록 안에서 초기화를 시켜주기 때문에 에러 발생 안한다.
    init{
        println(name)
        userName = name
    }
}

// 클래스 호출 방법
// 클래스를 호출 -> 인스턴스화 (Instance)
val user = User1("홍길동")

// 주생성자 init 간소화
class User2 constructor(name: String){
    val userName: String = name
}

//주생성자 -> constructor 생략
class User3(name: String){
    val userName: String = name
}

val user3 = User3("백길동")

//주생성자 -> 기본 값
class User4(name: String = "적길동"){
    val userName: String = name
}

val user4 = User4()

//생성자에서 받는 속성이 복수개인 경우
class User5(age: Int, name: String){
    var age: Int = age
    var name: String = name
//    init{
//        this.age = age
//        this.name = name
//    }
}

val user5 = User5(10,"짱구")
println(user5.age)



//모든 걸 생략
class User6(val name: String){

}


// 부생성자
// - constructor를 생략할 수 없다
// - 주생성자에는 객체를 만들기 위한 필수 조건이 있다면 부생성자는 객체를 만들기 위한 필수 조건이 아닌 옵션이다.
// 부생성자에는 주생성자에서 필요한 조건을 포함하고 있어야 한다.
// 부생성자는 주생성자에게 생성을 위임해야 한다.
class User7 constructor(name:String){
    var age: Int = 0
    val name: String
    init{
        this.name = name
    }

    //부생성자는 클래스명 우측에 올 수 없다 -> 클래스의 본문에 있어야 한다.
    constructor(name: String, age: Int): this(name){
        this.age = age
    }
}


val user7 = User7("가나다", 20)


class User8{
    var age: Int
    val name: String

    constructor(age: Int, name: String){
        this.age = 19
        this.name = name
    }

    fun myPrint(){
        println("${this.age}살, ${this.name}입니다")
    }
}

val user8 = User8(0, "김김감")

user8.myPrint()

user8.age = 60
user8.myPrint()


//late init
// var로 선언한 프로퍼티에만 적용 가능
// 주생성자에서는 사용 할 수 없다.
// getter/setter 적용 불가
// nullable에는 적용 불가
// 원시자료형 프로퍼티에는 적용이 불가
// 초기화 여부를 확인

class User9{
    lateinit var age: Int
    lateinit var name: String
}

//reflection ::
// 런타임에 프로그램의 구조를 조사 할 수 있는 기능