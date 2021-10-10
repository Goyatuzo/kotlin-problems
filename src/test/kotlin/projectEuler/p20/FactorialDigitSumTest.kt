package projectEuler.p20

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class FactorialDigitSumTest {
    @Test
    fun `10! should be 27`() {
        assertEquals(BigInteger.valueOf(27), FactorialDigitSum.solve(10))
    }
}