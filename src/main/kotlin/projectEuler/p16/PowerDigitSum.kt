package projectEuler.p16

import java.math.BigInteger

class PowerDigitSum {
    companion object {
        fun solve(base: Long, power: Int): BigInteger = BigInteger.valueOf(base).pow(power)
                .toString()
                .toCharArray()
                .sumOf { BigInteger(it.toString()) }
    }
}

fun main() {
    println(PowerDigitSum.solve(2, 1000))
}