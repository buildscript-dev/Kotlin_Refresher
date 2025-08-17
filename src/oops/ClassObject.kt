package oops
// A class is a blueprint for objects.
// It defines attributes (data) and methods (functions)
// that can be used to create and work with objects.
class ClassObject {

    // Properties (attributes of the class)
    var what: String = "Blueprint"
    var why: String = "To use OOP concepts, organize and structure code better."

    // Methods (functions inside a class)
    fun quesWhat() {
        println("$what is used to create building blocks.")
    }

    fun quesWhy() {
        println(why)
    }
}

// Using the class
fun main() {

    val obj = ClassObject() // creating an object
    obj.quesWhat()
    obj.quesWhy()
}
