package control_flow.`when`

//When is supercharged switch statement — but more powerful, flexible, and also an expression (it returns a value).

fun main() {
//Basics of when
print("Enter a day(digit only): ")
    val day = readln().toIntOrNull()

    when(day){
        1 -> println("Monday")
        2 -> println("Thuesday")
        3 -> println("Wednusday")
        4 -> println("Thusday")
        5 -> println("Friday")
        6 -> println("Satarday")
        7 -> println("Sunday")
        else -> println("Invalid Value")
    }

//1. when as an expression
//we can assign its result to a variable (like if):
// val calender = when(day){ }


//2. Multiple values per branch
    val twoDay = 6

    val type = when (twoDay) {
        1, 7 -> "Weekend"
        in 2..6 -> "Weekday"
        else -> "Invalid"
    }

    println(type) // Weekday

//3. No argument when
    val x = -5
    val sign = when {
        x > 0 -> "Positive"
        x < 0 -> "Negative"
        else -> "Zero"
    }
    println(sign) // Negative

//4. Type checking with is
fun checkType(obj: Any): String {
    return when (obj) {
        is Int -> "Integer"
        is String -> "String"
        else -> "Unknown"
    }
}

    println(checkType(42))      // Integer
    println(checkType("Hello")) // String


}