fun main() {

    println("Enter a word to reverse:")
    val word = readLine()

    // Lambda Function
    var lettersOnly = word?.filter { character -> character.isLetter() }

    println(word?.reversed())
}

// Normal Functions
fun reverse(word: String): String {
    val result = buildString {

        for (char in word.lastIndex downTo 0) {
            append(word[char])
        }
    }
    return result
}

// Extension Function
fun String.reversed(): String {
    val result = buildString {

        for (char in this@reversed.lastIndex downTo 0) {
            append(this@reversed[char])
        }
    }
    return result
}

// Function Overloading
fun Int.reversed(): Int {
    return this.toString().reversed().toInt()
}

