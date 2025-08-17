package oops

// Constructor are the special function inside a class that is automatically called when an object of that class is created.
//It is mainly used to initialize (set up) the object’s data.


// Primary Constructor
class Primary(val name: String, val age: Int){
    // The constructor is defined in the class header (primary constructor)

    // You can also define an initializer block
    init {
        println("Personal object created: Name = $name, Age = $age")
    }
}


// Secondary Constructor
class Secondary{
    val name: String
    val age: Int


    constructor(name: String, age: Int){
        this.name = name
        this.age = age
    }


}



fun main(){
    val primaryConst1 = Primary("Madara", 100)
    val primaryConst2 = Primary("Ankit", 20)
    val primaryConst3 = Primary("Lucky", 17)
    val primaryConst4 = Primary("Siddh", 18)
    val primaryConst5 = Primary("Nothing", 30)
//    val secondaryConst = Secondary("Madara", 20)
}