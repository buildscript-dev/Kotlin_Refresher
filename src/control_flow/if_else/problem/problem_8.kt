package control_flow.if_else.problem

//Problem: Login System Simulation

fun main(){
    val validUser = arrayOf("Ankit","Madara","Lucky","Siddh" )
    val validPass = arrayOf("1234", "ankit", "siddh.@10", "password")
    print("Enter Username: ")
    val userName = readln().toString().lowercase().replaceFirstChar { it.uppercase()}

    print("Enter Password: ")
    val password = readln().toString()

    if (userName in validUser && (password in validPass)){
println("Welcome, $userName")
    }else if( userName in validUser && (password !in validPass )){
println("Invalid Password...")
    }
    else if(userName !in validUser && (password in validPass)){
        println("Invalid Username...")
    }
    else{
        println("Invalid Both Details")
    }

}