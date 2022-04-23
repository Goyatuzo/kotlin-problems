package adventOfCode.v2021.day1

class SonarSweep {
    companion object {
        fun partOne(numbers: List<Int>): Int =
            numbers.foldIndexed(0) { idx, acc, curr ->
                if (idx > 0 && numbers[idx - 1] < curr) acc + 1 else acc
            }

        fun partTwo(numbers: List<Int>): Int {
            if (numbers.count() < 3) return -1

            var total = 0
            val previous = numbers.subList(0, 3).toMutableList()

            for (currVal in numbers.listIterator(3)) {
                val previousSum = previous.sum()
                previous[0] = previous[1]
                previous[1] = previous[2]
                previous[2] = currVal
                val currentSum = previous.sum()

                if (currentSum > previousSum) total++
            }

            return total
        }

        fun solve() {
            val text =
                this::class
                    .java
                    .getResource("/adventOfCode/2021/day1.txt")
                    ?.readText(Charsets.UTF_8)

            println(partOne(text!!.lines().filter { it.isNotEmpty() }.map { it.toInt() }))
            println(partTwo(text.lines().filter { it.isNotEmpty() }.map { it.toInt() }))
        }
    }
}

fun main() {
    SonarSweep.solve()
}
