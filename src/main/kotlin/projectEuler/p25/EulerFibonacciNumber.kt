package projectEuler.p25

import java.math.BigInteger

class EulerFibonacciNumber {
    companion object {
        fun solve(n: Int): Int =
            when (n) {
                0 -> 0
                1 -> 1
                else -> {
                    val cache = mutableListOf<BigInteger>(BigInteger.ZERO, BigInteger.ONE)

                    while (cache.last().toString().length < n) {
                        cache.add(cache[cache.size - 2] + cache[cache.size - 1])
                    }

                    cache.size - 1
                }
            }
    }
}

fun main() {
    println("1000-digit Fibonacci number: ${EulerFibonacciNumber.solve(1000)}")
}
