package projectEuler.p22

import org.junit.jupiter.api.Test
import projectEuler.p20.FactorialDigitSum
import java.math.BigInteger
import kotlin.test.assertEquals

class NamesScoresTest {
    @Test
    fun `COLIN should be 53`() {
        assertEquals(53.toBigInteger(), NamesScores.solveForOne(1, "COLIN"))
    }
}
