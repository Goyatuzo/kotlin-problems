package codeForces.v281

import java.math.BigDecimal
import java.math.BigInteger
import java.math.MathContext

class NearestFraction {
    companion object {
        fun solve(x: Int, y: Int, n: Int): String {
            var answer = ""
            val precision = MathContext(20)
            val target = BigDecimal(x).divide(BigDecimal(y), precision)

            var closest = BigDecimal(Int.MAX_VALUE)

            (1..n).forEach { denominator ->
                var numerator = 1
                do {
                    val current = BigDecimal(numerator++).divide(BigDecimal(denominator), precision)

                    if ((closest - target).abs() > (current - target).abs()) {
                        closest = current
                        answer = "${numerator - 1}/${denominator}"
                    }
                } while (current <= target)
            }

            return answer
        }
    }
}