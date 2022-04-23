package codeForces.v281

import java.util.*

class WordCapitalization {
    companion object {
        fun solve(input: String): String {
            return input.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }
    }
}

fun main() {
    val input = readLine()

    if (input != null) println(WordCapitalization.solve(input))
}
