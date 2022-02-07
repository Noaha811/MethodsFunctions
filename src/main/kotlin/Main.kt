//imports PI for calculating circle area
import kotlin.math.PI

//Noah Anderson

//function that gathers user input and returns area of a circle
fun areaCircle(): Double{
    print("Enter the radius of your circle: ")
    val rad = readLine()!!.toDouble()
    return PI*rad*rad
}

//function that gathers user input and returns area of a rectangle
fun areaRect(): Double{
    print("Enter one side of your rectangle: ")
    val side1 = readLine()!!.toDouble()
    print("Enter the other side of your rectangle: ")
    val side2 = readLine()!!.toDouble()
    return side1*side2
}

//function that gathers user input and returns area of a square
fun areaSquare(): Double{
    print("Enter one side of your square: ")
    val side = readLine()!!.toDouble()
    return side*side
}

//function that gathers user input and returns area of a triangle
fun areaTriangle(): Double{
    print("Enter the base length of your triangle: ")
    val base = readLine()!!.toDouble()
    print("Enter the height of your triangle: ")
    val height = readLine()!!.toDouble()
    return base*height*0.5
}

//Main function to run
fun main() {
    var result: Double
    var userInput: Int
    //loop that breaks upon the user choosing "5. Quit"
    while (true) {
        println("Enter the menu number of which area you want to solve for:")
        println("1. Area of Circle")
        println("2. Area of Rectangle")
        println("3. Area of Square")
        println("4. Area of Triangle")
        println("5. Quit")
        print("Enter your choice here: ")
        //try/catch statement to validate input
        try {
            userInput = readLine()!!.toInt()
            //menu for user choosing which option
            when (userInput) {
                1 -> {
                    result = areaCircle()
                }
                2 -> {
                    result = areaRect()
                }
                3 -> {
                    result = areaSquare()
                }
                4 -> {
                    result = areaTriangle()
                }
                5 -> {
                    println("Goodbye!")
                    break
                }
                else -> {
                    println("Invalid input! Please choose a valid option and try again!")
                    println("Only numerical inputs are accepted!")
                    continue
                }

            }
            println("The area of your shape is $result")

        } catch (e: Exception) {
            println("Invalid input! Please choose a valid option and try again!")
            println("Only numerical inputs are accepted!")
        }
    }
}

