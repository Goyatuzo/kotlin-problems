package adventOfCode.v2021.day1

class SonarSweep {
    companion object {
        fun partOne(numbers: List<Int>): Int = numbers.foldIndexed(0) { idx, acc, curr ->
            if (idx > 0 && numbers[idx-1] < curr) acc + 1 else acc
        }

        fun solve() {
            val text = this::class.java.getResource("/adventOfCode/2021/day1.txt")?.readText(Charsets.UTF_8)

            println(partOne(text!!.lines().filter { it.isNotEmpty() }.map { it.toInt() }))
        }
    }
}

fun main() {
    SonarSweep.solve()
}