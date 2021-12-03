package adventOfcode.v2021.day1

import adventOfCode.v2021.day1.SonarSweep
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SonarSweepTest {
    @Test
    fun `P1 (+1, -2, +3, +1) results in 3`() {
        assertThat(SonarSweep.partOne(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263))).isEqualTo(7)
    }
}