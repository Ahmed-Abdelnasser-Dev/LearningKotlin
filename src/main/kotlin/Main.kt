fun main() {
    val number = validateInput(getInput())
    printOutput(number)
}

//--------------------------------------------------------------------------------

// Getting the User input
fun getInput(): Int? {
    println("Please enter a number")
    return readln().toIntOrNull()
}

// Checking of the value is a true number or not
fun validateInput(input: Int?): Int {
    return if (input == null) {
        println("Invalid input. Please try again.")
        validateInput(getInput())
    } else {
        println("Your number is $input and is a valid integer")
        input
    }
}

// Check if the number is even or odd
fun isEven(num: Int): String {
    return if (num % 2 == 0) "Even" else "Odd"
}

// Printing out the output
fun printOutput(num: Int) {
    println("Your number is $num and it's: ${isEven(num)}")
}