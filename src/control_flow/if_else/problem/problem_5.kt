package control_flow.if_else.problem

fun main(){
    // To use character use only ('x') not the ("x")
    print("Enter a Character(digit/uppercase letter/ lowwercase letter/ something else): ")
    val character = readln().first()

    if (character in '0'..'9'){
        println("Digit")
    }
    else if (character in 'A'..'Z'){
        println("Uppercase Letter")
    }
    else if (character in 'a'..'z'){
        println("Lowercase Letter")
    }
    else{
        println("Symbol or Something Else")
    }
}