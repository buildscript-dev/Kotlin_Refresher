package control_flow.if_else.problem

//Problem: Triangle Validity + Type

fun main(){

    print("First Side of Triangle: ")
    val firstSide = readln().toIntOrNull()
    print("Second Side of Triangle: ")
    val secondSide = readln().toIntOrNull()
    print("Third Side of Triangle: ")
    val thirdSide = readln().toIntOrNull()

    if (firstSide == secondSide && secondSide == thirdSide){
println("It is Equilateral Triangle")
    }
    else if (firstSide == secondSide || firstSide == thirdSide || secondSide == thirdSide){
        println("It is Isosceles Triangle")
    }
    else if ( firstSide != secondSide && secondSide != thirdSide){
        println("It is Scalene Triangle")
    }
    else{
        println("It is not a Triangle")
    }

}