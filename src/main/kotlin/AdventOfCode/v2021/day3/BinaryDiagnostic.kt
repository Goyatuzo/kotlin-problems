package adventOfCode.v2021.day3

class BinaryDiagnostic {
    fun partOne(binaries: List<String>): Int {
        val counts = IntArray(binaries[0].count())

        binaries.forEach { binary ->
            binary.forEachIndexed { idx, letter ->
                if (letter == '0') counts[idx]-- else counts[idx]++
            }
        }


        val number = Integer.parseUnsignedInt(counts.map { if (it > 0) 1 else 0 }.toString(), 2)

        return number * number.inv()
    }
}