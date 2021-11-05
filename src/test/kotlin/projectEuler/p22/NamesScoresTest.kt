package projectEuler.p22

import org.junit.jupiter.api.Test
import projectEuler.p20.FactorialDigitSum
import java.math.BigInteger
import kotlin.test.assertEquals

class NamesScoresTest {
    @Test
    fun `COLIN on row 1 should be 53`() {
        assertEquals(53.toBigInteger(), NamesScores.solveForOne(1, "COLIN"))
    }

    @Test
    fun `COLIN on row 938 should be 49714`() {
        assertEquals(49714.toBigInteger(), NamesScores.solveForOne(938, "COLIN"))
    }
}
