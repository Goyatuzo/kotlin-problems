package codeForces.v158

import kotlin.math.ceil

class Taxi {
    companion object {
        fun solve(groups: List<Int>): Int {
            val counts = mutableListOf(0, 0, 0, 0, 0)

            for (number in groups) {
                counts[number]++
            }

            // Always need 1 taxi for this
            var taxiCount = counts[4]

            // Each of 3s is 1 Taxi
            taxiCount += maxOf(0, counts[3])

            // Remove the number of 3s used from 1
            counts[1] = maxOf(0, counts[1] - counts[3])

            // Get as many taxis for 2 + 2
            taxiCount += counts[2] / 2

            // Remove the number of 2s used
            counts[2] -= (counts[2] / 2) * 2

            // Take as many 1s for the last 2
            if (counts[2] == 1) {
                taxiCount += 1
                counts[1] -= 2
            }

            if (counts[1] > 0) {
                taxiCount += ceil(counts[1].toFloat() / 4).toInt()
            }

            return taxiCount
        }
    }
}

fun main() {
    readLine()
    val values = readLine()?.split(' ')?.map { it.toInt() }

    if (values != null) {
        println(Taxi.solve(values))
    }
}