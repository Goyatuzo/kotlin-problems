package adventOfcode.v2018.day1

import adventOfCode.v2018.day1.ChronalCalibration
import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class ChronalCalibrationTest {
    @Test
    fun `P1 (+1, -2, +3, +1) results in 3`() {
        assertEquals(3, ChronalCalibration.partOne(listOf("+1", "-2", "+3", "+1")))
    }

    @Test
    fun `P1 - (+1, +1, -2) results in 0`() {
        assertEquals(0, ChronalCalibration.partOne(listOf("+1", "+1", "-2")))
    }

    @Test
    fun `P1 - (-1, -2, -3) results in -6`() {
        assertEquals(-6, ChronalCalibration.partOne(listOf("-1", "-2", "-3")))
    }

    @Test
    fun `P2 - (+1, -1) results in 0`() {
        assertEquals(0, ChronalCalibration.partTwo(listOf("+1", "-1")))
    }

    @Test
    fun `P2 - (+3, +3, +4, -2, -4) results in 10`() {
        assertEquals(10, ChronalCalibration.partTwo(listOf("+3", "+3", "+4", "-2", "-4")))
    }

    @Test
    fun `P2 - (-6, +3, +8, +5, -6) results in 5`() {
        assertEquals(5, ChronalCalibration.partTwo(listOf("-6", "+3", "+8", "+5", "-6")))
    }
}
