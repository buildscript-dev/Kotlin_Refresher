package control_flow.if_else

//Note: Control Fow statements determine the next statement to be executed.
//For example, the statements if-else, if, when, while, for, and do are flow control statements.
fun main(){
    If_Else()
}


//if...else Expression
fun If_Else() {

    //1. Basic
    print("Print either true or false: ")
    val condition = readLine().toBoolean()
    if (condition) {
        println("code block A to be executed if condition is $condition")
    } else {
        println("code block B to be executed if condition is $condition")
    }

    //2. if as an expression
    print("Enter Username: ")
    val userName = readLine().toString()
    val status = if (userName == "Madara") "Welcome, ${userName}" else "You are restricted"
    println(status)

    //3. Multiple branches with else if
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

    //4. Nested/block values
    val num = -5
    val result = if (num > 0) {
        println("Positive")
        num
    } else {
        println("Not positive")
        0
    }
    println(result) // prints: "Not positive" then 0

    //5. Common patterns
    val age = 25
    val category = if (age in 0..12){
        "Child"
    }else if(age in 13 ..19){
        "Teen"
    }else{
        "Adult"
    }

    if(userName.isNullOrBlank()){
        println("Please enter your name.")
    }else{
        println("Hello,$userName")
    }

}