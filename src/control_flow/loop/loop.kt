package control_flow.loop


fun main(){
//1. for Loop (definite iteration)
//Used when you know how many times you want to repeat

    for(i in 1..100){
        println(i)
    }

    for (i in 1 until 5) { // until excludes the upper bound
        println(i) // 1,2,3,4
    }

    for (i in 10 downTo 1) { // count backwards
        println(i)
    }

    for (i in 0..10 step 2) { // step = skip
        println(i) // 0,2,4,6,8,10
    }

    val fruits = listOf("apple", "banana", "cherry")

    for (fruit in fruits) {
        println(fruit)
    }

    for ((index, value) in fruits.withIndex()) {
        println("$index: $value")
    }

//2. while Loop (indefinite iteration)

//Runs as long as condition is true.

    var x = 5
    while(x > 0){
        println(x)
        x--
    }

//3. do..while Loop

//Like while, but runs at least once (condition checked after).

    var y = 1
    do {
        println("Runs once even if condition false")
        y++
    } while (y == 0)

//4. Loop Control Keywords

//break → exits loop immediately
//continue → skips current iteration

    for (i in 1..5) {
        if (i == 3) continue  // skip 3
        if (i == 4) break     // stop loop
        println(i)
    }

//5. Nested Loops + Labels

//Kotlin allows labels to control outer loops.

    outer@ for (i in 1..3) {
        for (j in 1..3) {
            if (i == 2 && j == 2) break@outer
            println("i=$i, j=$j")
        }
    }


}