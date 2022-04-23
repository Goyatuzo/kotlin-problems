package projectEuler.p67

import projectEuler.p18.MaximumPathSumI

class MaximumPathSumII {
    companion object {
        fun solve(): Int? {
            val text =
                this::class
                    .java
                    .getResource("/projectEuler/MaximumPathSumII.txt")
                    ?.readText(Charsets.UTF_8)
            val triangle =
                text?.split('\n')?.map { it.trim().split(' ').map { it.toInt() } } ?: emptyList()

            return MaximumPathSumI.triangle(triangle)
        }
    }
}

fun main() {
    println("Maximum Path Sum II: ${MaximumPathSumII.solve()}")
}
