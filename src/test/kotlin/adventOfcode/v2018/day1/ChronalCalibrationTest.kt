package adventOfcode.v2018.day1

import adventOfCode.v2018.day1.ChronalCalibration
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ChronalCalibrationTest {
    @Test
    fun `1 - (+1, -2, +3, +1) results in 3`() {
        assertEquals(3, ChronalCalibration.partOne(listOf("+1", "-2", "+3", "+1")))
    }

    @Test
    fun `1 - (+1, +1, -2) results in 0`() {
        assertEquals(0, ChronalCalibration.partOne(listOf("+1", "+1", "-2")))
    }

    @Test
    fun `1 - (-1, -2, -3) results in -6`() {
        assertEquals(-6, ChronalCalibration.partOne(listOf("-1", "-2", "-3")))
    }

    @Test
    fun `2 - (+1, -1) results in 0`() {
        assertEquals(-6, ChronalCalibration.partOne(listOf("-1", "-2", "-3")))
    }
}