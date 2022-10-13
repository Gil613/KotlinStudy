//클래스 선언
class Person{

}


//생성자
//주생성자 -> 풀버전,
// 클래스 이름 옆에 괄호로 둘러싸인 코드
// 클래스를 통해서 객체를 만드는데 필요한 재료들 적어 준다.
// 재료이름(변수명):재료타입(변수타입)
//반드시 한개만 존재한다.
//constructor 키워드 생략 가능
class User1 constructor(name: String) {
    //초기화 블럭 안에서 초기화가 되기 때문에 에러 발생 안한다.
    var name: String //클래스 속성(property)은 init블럭에서 초기화 된다.
    init{ //클래스가 생성될때 호출된다.
        println(name)
        this.name = name
    }
}

// 클래스 호출 방법 -> 클래스를 통해서 객체를 만드는 방법
// 인스턴스화 (Instance)
// 객체 -> Object, Instance
val user1 = User1("유길상")


//주생성자 -> 초기화 블록 생략
class User2 constructor(name: String){
    val name: String = name
}

val user2 = User2("유길상")

//주생성자 -> constructor 생략 방법
class User3 (name: String){
    val name: String = name
}

val user3 = User3("유길상")

//주생성자 -> 기본값 설정
class User4(name: String = "유길상"){
    val name: String = name
}

val user4 = User4()


//생성자에서 받는 속성이 복수개인경우
class User5(age: Int, name: String){
    val age = age
    val name = name
}

val user5 = User5(13,"유길상")
println(user5.name + user5.age)

//주생성자 -> 모든 것을 다 생략
class User6(val name: String){

}
val user6 = User6("유길상")


//부생성자
// 부가적인 요소를 적는다.(옵션)
// 주생성자에서 필요한 조건을 포함하고 있어야 한다.
// 부생성자는 주생성자에게 생성을 위임해야 한다.
class User6 constructor(name: String){
    var age: Int
    val name : String
    init{
        this.name = name
    }

    //부생성자 시작
    constructor(name: String, age: Int): this(name){
        this.age = age
    }
}