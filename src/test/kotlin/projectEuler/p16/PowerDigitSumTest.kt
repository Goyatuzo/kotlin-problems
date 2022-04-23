package projectEuler.p16

import java.math.BigInteger
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class PowerDigitSumTest {
    @Test
    fun `2^15 results in 26`() {
        assertEquals(BigInteger.valueOf(26), PowerDigitSum.solve(2, 15))
    }
}
