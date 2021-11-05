package projectEuler.p22

import java.math.BigInteger

class NamesScores {
    companion object {
        fun solveForOne(i: Int, name: String): BigInteger =
            (name.lowercase().fold(0) { acc, curr -> curr.code - ('a'.code - 1) + acc } * i).toBigInteger()
    }
}