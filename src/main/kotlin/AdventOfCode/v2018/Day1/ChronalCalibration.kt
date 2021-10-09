package adventOfCode.v2018.day1

class ChronalCalibration {
    companion object {
        fun calculate(frequencies: List<String>) = frequencies.fold(0) { acc, curr ->
            val value = curr.drop(1)

            acc + if (curr.first() == '+') value.toInt() else -(value.toInt())
        }
    }
}