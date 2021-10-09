package adventOfcode.v2018.day1

import adventOfCode.v2018.day1.ChronalCalibration
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ChronalCalibrationTest {
    @Test
    fun `(+1, -2, +3, +1) results in 3`() {
        assertEquals(3, ChronalCalibration.calculate(listOf("+1", "-2", "+3", "+1")))
    }

}