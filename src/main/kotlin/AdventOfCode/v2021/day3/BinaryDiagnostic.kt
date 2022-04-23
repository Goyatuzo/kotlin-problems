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

            val toBinary =
                counts.map { if (it > 0) '1' else '0' }.fold("") { curr, acc -> curr + acc }
            val toInverse =
                counts.map { if (it > 0) '0' else '1' }.fold("") { curr, acc -> curr + acc }
            return Integer.parseUnsignedInt(toBinary, 2).toUInt() *
                Integer.parseUnsignedInt(toInverse, 2).toUInt()
        }

        private fun mostCommon(binaries: List<String>, comp: (x: Int, y: Int) -> Boolean): UInt {
            var zeros = binaries
            var ones = binaries
            var idx = 0

            while (zeros.size > 1) {
                ones = ones.filter { it[idx] == '1' }
                zeros = zeros.filter { it[idx] == '0' }

                if (comp(ones.count(), zeros.count())) {
                    ones = zeros
                } else {
                    zeros = ones
                }

                idx++
            }

            val binary = if (zeros.isNotEmpty()) zeros.first() else ones.first()

            return Integer.parseUnsignedInt(binary, 2).toUInt()
        }

        fun partTwo(binaries: List<String>) =
            mostCommon(binaries) { x, y -> x < y } * mostCommon(binaries) { x, y -> x >= y }

        fun solve() {
            val text =
                this::class
                    .java
                    .getResource("/adventOfCode/2021/day3.txt")
                    ?.readText(Charsets.UTF_8)

            val binaries = text!!.lines().filter { it.isNotEmpty() }

            println(partOne(binaries))
            println(partTwo(binaries))
        }
    }
}

fun main() {
    BinaryDiagnostic.solve()
}
