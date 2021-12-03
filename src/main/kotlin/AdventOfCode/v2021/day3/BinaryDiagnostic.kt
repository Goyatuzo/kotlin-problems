package adventOfCode.v2021.day3

class BinaryDiagnostic {
    companion object {
        fun partOne(binaries: List<String>): UInt {
            val counts = IntArray(binaries[0].count())

            binaries.forEach { binary ->
                binary.forEachIndexed { idx, letter ->
                    if (letter == '0') counts[idx]-- else counts[idx]++
                }
            }

            val toBinary = counts.map { if (it > 0) '1' else '0' }.fold("") { curr, acc -> curr + acc }
            val toInverse = counts.map { if (it > 0) '0' else '1' }.fold("") { curr, acc -> curr + acc }
            return Integer.parseUnsignedInt(toBinary, 2).toUInt() * Integer.parseUnsignedInt(toInverse, 2).toUInt()
        }

        fun solve() {
            val text = this::class.java.getResource("/adventOfCode/2021/day3.txt")?.readText(Charsets.UTF_8)

            val binaries = text!!.lines().filter { it.isNotEmpty() }

            println(partOne(binaries))
        }
    }
}

fun main() {
    BinaryDiagnostic.solve()
}