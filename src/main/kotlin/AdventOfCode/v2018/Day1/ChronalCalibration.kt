package adventOfCode.v2018.day1

class ChronalCalibration {
    companion object {
        private fun accumulate(curr: Int, next: String): Int =
            curr + if (next.first() == '+') next.drop(1).toInt() else -(next.drop(1).toInt())

        fun partOne(frequencies: List<String>): Int = frequencies.fold(0) { acc, curr ->
            accumulate(acc, curr)
        }

        fun partTwo(frequencies: List<String>): Int {
            val set = mutableSetOf(0)
            var runningTotal = 0

            while (true) {
                frequencies.forEach { freq ->
                    runningTotal = accumulate(runningTotal, freq)

                    if (set.contains(runningTotal)) {
                        return runningTotal
                    } else {
                        set.add(runningTotal)
                    }
                }
            }
        }

        fun solve() {
            val text = this::class.java.getResource("/adventOfCode/2018/day1.txt")?.readText(Charsets.UTF_8)

            println(partOne(text!!.lines().filter { it.isNotEmpty() }))
            println(partTwo(text.lines().filter { it.isNotEmpty() }))
        }
    }
}

fun main() {
    ChronalCalibration.solve()
}