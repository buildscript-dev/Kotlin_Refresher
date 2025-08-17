package control_flow.if_else.problem

// Problem: Even / Odd

fun main(){
    print("Enter a Number: ")
    val num = readln()?.toIntOrNull()
    if (num == null){
        println("Invalid value: $num")
        println("Try Again!")
    }
    else if (num % 2 == 0 ){
        println("$num is a Even Number.")
    }
    else{
        println("$num is a Odd Number.")
    }

}