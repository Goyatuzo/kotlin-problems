package adventOfcode.v2018.day1

import adventOfCode.v2018.day1.ChronalCalibration
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ChronalCalibrationTest {
    @Test
    fun `(+1, -2, +3, +1) results in 3`() {
        assertEquals(3, ChronalCalibration.calculate(listOf("+1", "-2", "+3", "+1")))
    }

    @Test
    fun `(+1, +1, -2) results in 0`() {
        assertEquals(0, ChronalCalibration.calculate(listOf("+1", "+1", "-2")))
    }

    @Test
    fun `(-1, -2, -3) results in -6`() {
        assertEquals(-6, ChronalCalibration.calculate(listOf("-1", "-2", "-3")))
    }
}