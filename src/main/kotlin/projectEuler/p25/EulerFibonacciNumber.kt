package projectEuler.p25

import java.math.BigInteger

class EulerFibonacciNumber {
    companion object {
        fun solve(n: Int): Int {
            var curr = BigInteger.ONE
            var prev = BigInteger.ZERO
            var sequence = 0
            var count = 0

            while (count < n) {
                val next = curr + prev
                prev = curr
                curr = next

                count = next.toString().length
                sequence++
            }

            return sequence
        }
    }
}