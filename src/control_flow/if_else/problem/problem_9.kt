package control_flow.if_else.problem

//Problem: Nested Salary Calculator

fun main(){
    print("Enter Your Salary: ")
    val salary = readln().toIntOrNull()


    if (salary == null){
        println("Invalid Input...")
    }
    else if (salary <= 10000){
        println("You have to pay 0% Tax")
    }
    else if (salary <= 50000) {
        println("You have to pay 10% Tax")
        println("As your salary is $salary, then")
        println("You have to pay Rs.${(salary - 10000) * 0.1} from your salary.")
    }
    else if(salary <= 100000){
        println("You have to pay 20% Tax")
        println("As your salary is $salary, then")
        println("You have to pay Rs.${(40000 * 0.1) + (salary - 50000) * 0.2} from your salary.")
    }
    else{
        println("You have to pay 30% Tax")
        println("As your salary is $salary, then")
        println("You have to pay Rs.${(40000 * 0.1) + (50000 * 0.2) + (salary - 100000) * 0.3} from your salary.")    }
    }