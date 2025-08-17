package control_flow.if_else.problem

//Problem: ATM Withdrawal Rules

fun main(){
    print("Please Insert Your Name: ")
    val userName = readln().toString()
    print("Enter your Pin: ")
    val Pass = readlnOrNull()
    var balance = 99999


    print("Please Select an option(withdrawal / balance): ")
    val option = readln().toString().lowercase()

    if (option == "withdrawal"){
        print("Enter Withdrawl Amount: ")
        val withdrawal = readlnOrNull()?.toIntOrNull()
        if (withdrawal == null){
            println("Invalid Input")
        }else if (withdrawal % 100 == 0){
            println("Withdrawal of amount of Rs.$withdrawal is Successful.")
        }
        else{
            println("You can only withdrawl amount which is multiple of 100")
        }
    }
    else if(option == "balance"){
        if (balance >= 0){
            println("You have Rs.${balance}.")
        }
        else{
            println("Insufficient Balance")
        }
    }
    else{
        println("Either you make trying mistake or selecting invalid option.")
    }


}