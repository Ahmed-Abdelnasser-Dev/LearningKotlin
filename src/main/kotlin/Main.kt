fun main() {

    println("How many numbers will you enter? ")
    val amountOfNumbers: Int = readln().toIntOrNull() ?: 0
    val numbers = mutableSetOf<Int>()
    
    var i = 0
    while (i < amountOfNumbers) {

        println("Please enter number #${i + 1}")
        val number = readln().toIntOrNull() ?: continue
        numbers.add(number)
        i++
    }

    println("The total Sum is: $numbers")
}