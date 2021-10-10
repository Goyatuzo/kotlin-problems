package projectEuler.p16

import java.math.BigInteger

class PowerDigitSum {
    companion object {
        fun solve(base: Long, power: Int): Int = BigInteger.valueOf(base).pow(power).toString().chars().sum()
    }
}

fun main() {
    println(PowerDigitSum.solve(2, 1000))
}