package projectEuler.p20

import java.math.BigInteger

class FactorialDigitSum {
    companion object {
        fun solve(fact: Int): BigInteger = when (fact) {
            0, 1 -> BigInteger.valueOf(1)
            else -> (2..fact)
                .fold(BigInteger.valueOf(1)) { acc, curr -> acc * BigInteger.valueOf(curr.toLong()) }
                .toString()
                .toCharArray()
                .sumOf { BigInteger(it.toString()) }
        }
    }
}

fun main() {
    println(FactorialDigitSum.solve(100))
}