fun main(){

    println("-----------สร้างตัวแปรฮิปโป----------")

    //นี่คือ Hippo ของฉัน
    var myhippo = Hippo()
    myhippo.eat()
    myhippo.roam()
    myhippo.makeNoise()
    myhippo.sleep()


    println("-----------สร้างตัวแปรแมว----------")

    //สร้างแมวของเรา
    var mycat = cat()
    //เขียนให้แมวเรา eat, roam , makeNoise, sleep
    mycat.eat()
    mycat.roam()
    mycat.makeNoise()
    mycat.sleep()


    println("----------สร้างตัวแปรหมา----------")
    //หมาของเรา
    var mydog = dog()
    //เขียนให้หมาเรา eat, roam , makeNoise, sleep
    mydog.eat()
    mydog.roam()
    mydog.makeNoise()
    mydog.sleep()
    println("--------------------------------")

}

open class Animal{
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    open fun makeNoise(){
        println("This is Animal is making Noise")
    }

    open fun eat(){
        println("This is Animal is eating")
    }

    open fun roam(){
        println("This is Animal is roaming")
    }

    fun sleep(){
        println("This is Animal is sleeping")
    }

}
 class Hippo : Animal(){

     override val image: String
         get() = "hippo.jpg"

     override val food: String
         get() = "Grass"

     override val habitat: String
         get() = "Water"

     override fun makeNoise() {
         println("This hippo is making noise HIPHIP")
     }

     override fun eat() {
         println("This hippo is eating $food")
     }
 }

class cat : Animal(){


    override val image: String
        get() = "cat.jpg"

    override val food: String
        get() = "อาหารแมว"

    override val habitat: String
        get() = "meow meow"

    override fun makeNoise() {
        println("This cat is making noise meow meow")
    }

    override fun eat() {
        println("This cat is eating $food")
    }
}

class dog : Animal(){


    override val image: String
        get() = "dog.jpg"

    override val food: String
        get() = "อาหารหมา"

    override val habitat: String
        get() = "Boo boo"

    override fun makeNoise() {
        println("This dog is making noise boo boo")
    }

    override fun eat() {
        println("This dog is eating $food")
    }
}

