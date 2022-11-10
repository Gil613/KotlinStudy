//1. Warrior, Knight, Monster는 체력, 공격력, 방어력이 존재하며  생존 여부를 알 수 있어야 한다.
//2. Knight는 hardAttack 기능이 있고, 이 기능을 사용하기 위해서는 energy가 3필욯다
//3. Warrior는 monster를 특정 마리수 이상 처치하면 Knight로 레벨 업이 가능하다
//
//프로그램 동작 예시
//Monster 생성
//Monster 아직 살아 있습니다. 체력: 50
//Warrior가 공격합니다.
//Monster가 아직 살아있습니다. 체력: 41
//Monster가 공격합니다.
//4. Warrior가 레벨업 하는 반복문 작성



open class Warrior constructor(hp: Int, var pow: Int, var def: Int){
    var hp: Int = 100
        set(value){
            if(value<=0){
                field = 0
                this.isAlive = false
            }else field = value
        }
    init{
        this.hp = hp
    }

    var isAlive: Boolean = true
        get(){
            if(field == true) println("Warrior가 아직 살아 있습니다. 체력 : ${this.hp}")
            else println("Warrior가 사망하였습니다.")
            return field
        }



    var killCount: Int = 0



    open fun attack(monster: Monster){
        println("공격합니다.")
        if (!monster.defence(this)){
            killCount++
            println("몬스터를 처치했습니다. 현재 킬 카운트 : ${killCount}")
        }
    }

    fun defence(monster: Monster): Boolean{
        val dam: Int = monster.pow - def
        hp -= if(dam > 0) dam else 0
        return this.isAlive
    }

    fun lvUp(): Knight?{
        if(this.killCount > 5){
            println("레벨업 했습니다.")
            return Knight(this)
        }else{
            return null
        }
    }
}

class Knight constructor(warrior: Warrior): Warrior(warrior.hp, warrior.pow, warrior.def ){
    var energy: Int = 0
    var kHp: Int = hp+10
    var kPow: Int = pow+5
    var kDef: Int = def+5

    override fun attack(monster: Monster) {
        super.attack(monster)
        energy++
    }

    fun hardAttack(monster: Monster){
        if(energy >= 3 && monster.isAlive) {
            monster.hp -= kPow + 30
            energy -= 3
        }else println("에너지가 부족합니다.")
    }
}


class Monster(hp: Int, var pow: Int, var def: Int){
    var hp: Int = 100
        set(value){
            if(value<=0){
                field = 0
                this.isAlive = false
            }else field = value
        }

    init{
        this.hp = hp
    }

    var isAlive: Boolean = true
        get(){
            if(field == true) println("Monster가 아직 살아 있습니다. 체력 : ${this.hp}")
            else{
                println("Monster가 사망하였습니다.")
            }
            return field
        }





    fun bite(warrior: Warrior){
        println("Monster가 공격합니다.")
        warrior.defence(this)
    }

    fun defence(warrior: Warrior): Boolean{
        val dam: Int = warrior.pow - def
        this.hp -= if(dam > 0) dam else 0
        return this.isAlive
    }

}

val warrior = Warrior(50, 10, 0)


loop@ while(warrior.lvUp() == null) {
    val monster = Monster(20, 10, 3)
    while(monster.isAlive) {
        warrior.attack(monster)
        monster.bite(warrior)
        if(!warrior.isAlive){
            break@loop
        }
    }
}

val knight: Knight? = warrior.lvUp()