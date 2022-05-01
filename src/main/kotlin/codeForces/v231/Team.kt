package codeForces.v231

class Team {
    companion object {
        fun solve(thoughts: List<List<Int>> ) = thoughts.fold(0) { acc, curr ->
            when (curr.sum()) {
                0, 1 -> acc
                else -> acc + 1
            }
        }
    }
}