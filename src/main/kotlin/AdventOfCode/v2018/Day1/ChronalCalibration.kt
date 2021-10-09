package adventOfCode.v2018.day1

import java.io.File


class ChronalCalibration {
    companion object {
        fun calculate(frequencies: List<String>) = frequencies.fold(0) { acc, curr ->
            val value = curr.drop(1)

            acc + if (curr.first() == '+') value.toInt() else -(value.toInt())
        }

        fun solve() {
            val text = this::class.java.getResource("/adventOfCode/2018/day1.txt")?.readText(Charsets.UTF_8)

            println(calculate(text!!.lines().filter { it.isNotEmpty() }))
        }
    }
}

fun main() {
    ChronalCalibration.solve()
}