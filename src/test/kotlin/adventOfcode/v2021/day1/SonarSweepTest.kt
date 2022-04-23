package adventOfcode.v2021.day1

import adventOfCode.v2021.day1.SonarSweep
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class SonarSweepTest {
    @Test
    fun `Test given in part 1`() {
        assertThat(SonarSweep.partOne(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))
            .isEqualTo(7)
    }

    @Test
    fun `Test given in part 2`() {
        assertThat(SonarSweep.partTwo(listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)))
            .isEqualTo(5)
    }
}
