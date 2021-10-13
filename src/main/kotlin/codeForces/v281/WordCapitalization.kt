package codeForces.v281

class WordCapitalization {
    companion object {
        fun solve(input: String): String {
            return input.capitalize()
        }
    }
}

fun main () {
    val input = readLine()

    if (input != null)
        println(WordCapitalization.solve(input))
}