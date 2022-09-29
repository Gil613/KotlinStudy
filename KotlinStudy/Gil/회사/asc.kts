class singer(val name: String, val group: Boolean){

    fun isGroup(){
        print("${this.name}은 ")
        if(this.group){
            println("그룹입니다.")
        }else{
            println("솔로입니다.")
        }
    }
}

val a = singer("빅뱅", false)

a.isGroup()