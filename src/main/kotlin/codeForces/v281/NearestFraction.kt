package codeForces.v281

import kotlin.math.abs

class NearestFraction {
    companion object {
        fun solve(x: Int, y: Int, n: Int): String {
            var answer = ""
            val target = x.toDouble() / y

            var closest = Double.MAX_VALUE

            (1..n).forEach { denominator ->
                var numerator = 0
                do {
                    val current = (numerator++).toDouble() / denominator

                    if (abs(closest - target) > abs(current - target)) {
                        closest = current
                        answer = "${numerator - 1}/${denominator}"
                    }
                } while (current <= target)
            }

            return answer
        }
    }
}

fun main() {
    val input = readLine()

    if (input != null) {
        val parsed = input.split(' ').map { it.toInt() }
        println(NearestFraction.solve(parsed[0], parsed[1], parsed[2]))
    }
}