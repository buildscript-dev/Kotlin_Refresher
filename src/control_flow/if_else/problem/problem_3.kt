package control_flow.if_else.problem

//Problem: Largest of Three Numbers

fun main(){
    print("Enter first number: ")
    val a = readln().toInt()
    print("Enter second number: ")
    val b = readln().toInt()
    print("Enter third number: ")
    val c = readln().toInt()

    print("Input: $a, $b, $c")
    var largest = a

    if (b > largest) {
        largest = b
    }
    if (c > largest) {
        largest = c
    }

    println("Output: The largest number is $largest")
}