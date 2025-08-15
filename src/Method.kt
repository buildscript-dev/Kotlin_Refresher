// NOTE: In Kotlin, a Method is just a function that belongs to a class (or interface or object).
// It can access that class’s properties and `this` keyword.

// ------------------------ Example: Basic Method ------------------------
class Car {
    // start() is a method of class Car
    fun start() {
        println("BMW is Starting....")
        // You can call it on a specific car instance:
        // val car = Car()
        // car.start()
    }
}

// ------------------------ Types of Methods ------------------------
class Lamborgini {

    // 1. Instance Method:
    // - Inside a class, without companion object
    // - Call: objectInstance.method()
    // - Use when the method needs access to object data (this)
    fun engine(name: String) = println("Hello, $name")

    companion object {
        // 2. Static-like Method:
        // - Inside a companion object or object
        // - Call: ClassName.method()
        // - Use when behavior doesn't depend on an instance
        fun info() = println("I'm like a static method")
    }
}

// 3. Extension Method:
// - Declared outside class using `fun ClassName.methodName()`
// - Call: like a normal method
// - Use when you can’t modify the original class but want to add functionality
fun String.isPalindrome(): Boolean = this == this.reversed()

// 4. Abstract / Overridden Methods:
// - Declared in abstract classes or interfaces
// - Call: Implement in subclasses
// - Use when you need polymorphism
abstract class Volvo {
    abstract fun makeSound()
}
class Cat : Volvo() {
    override fun makeSound() = println("Meow")
}

// 5. Inline Method:
// - Declared with `inline` keyword
// - Call: same as normal
// - Use for performance with higher-order functions
inline fun repeatTwice(action: () -> Unit) {
    action()
    action()
}

// 6. Suspend Method:
// - Declared with `suspend` keyword
// - Call: from a coroutine
// - Use for asynchronous or long-running tasks
suspend fun loadData() {
    // Simulate network call
}

// ------------------------ Usage Examples ------------------------
fun main() {
    // Instance method
    val car = Car()
    car.start()

    val lambo = Lamborgini()
    lambo.engine("Huracán")

    // Static-like method
    Lamborgini.info()

    // Extension method
    println("madam".isPalindrome()) // true

    // Abstract/Overridden method
    val myCat: Volvo = Cat()
    myCat.makeSound()

    // Inline method
    repeatTwice { println("Zoom!") }
}


