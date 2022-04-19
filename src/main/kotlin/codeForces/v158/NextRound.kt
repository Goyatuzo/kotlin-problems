package codeForces.v158

class NextRound {
    companion object {
        fun solve(k: Int, scores: List<Int>): Int = scores.foldIndexed(0) { idx, acc, curr ->
            if (curr == 0) {
                acc
            } else {
                if (idx > k && scores[k] == curr) {
                    acc + 1
                } else if (idx <= k) {
                    acc + 1
                } else {
                    acc
                }
            }
        }
    }
}

fun main() {
    val first = readLine()?.split(' ')?.map { it.toInt() }
    val values = readLine()?.split(' ')?.map { it.toInt() }

    if (first != null && values != null) {
        val (_, k) = first

        println(NextRound.solve(k, values))
    }
}