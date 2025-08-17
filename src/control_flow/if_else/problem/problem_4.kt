package control_flow.if_else.problem

fun main(){
    print("Enter your score: ")
    val score = readLine()?.toIntOrNull()

    if (score == null) {
        println("Invalid Input")
    } else if (score >= 90) {
        println("You have brilliant grade: 'A'")
    } else if (score >= 80) {
        println("You have excellent grade: 'B'")
    } else if (score >= 70) {
        println("You have good grade: 'C'")
    } else if (score >= 35) {
        println("You have to improve your grade: 'D'")
    } else {
        println("You are failed: 'F'")
    }
}