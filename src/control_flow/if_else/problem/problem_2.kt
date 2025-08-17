package control_flow.if_else.problem

// Problem: Leap Year Check

fun main(){
    print("Enter Year: ")
    val year = readln().toIntOrNull()

    if (year == null){
       print("Invalid Year: $year")
    }
    else if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)){
        print("Year $year is a Leap Year.")
    }
    else{
        print("Year $year is not a Leap Year.")
    }
}