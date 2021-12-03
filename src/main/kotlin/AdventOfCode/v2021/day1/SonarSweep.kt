package adventOfCode.v2021.day1

class SonarSweep {
    companion object {
        fun solve(numbers: List<Int>): Int = numbers.foldIndexed(0) { idx, acc, curr ->
            if (idx > 0 && numbers[idx-1] < curr) acc + 1 else acc
        }
    }
}