package projectEuler.p22

import java.math.BigInteger

class NamesScores {
    companion object {
        fun solveForOne(i: Int, name: String): BigInteger =
            (name.lowercase().fold(0) { acc, curr -> curr.code - ('a'.code - 1) + acc } * i)
                .toBigInteger()

        fun solve(): BigInteger {
            val text =
                this::class.java.getResource("/projectEuler/names.txt")?.readText(Charsets.UTF_8)
            val names = text?.replace("\"", "")?.split(',') ?: emptyList()

            return names.sorted().foldIndexed(BigInteger.ZERO) { idx, acc, curr ->
                acc + solveForOne(idx + 1, curr)
            }
        }
    }
}

fun main() {
    println(NamesScores.solve())
}
