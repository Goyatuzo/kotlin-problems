package adventOfcode.v2021.day2

import adventOfCode.v2021.day2.Direction
import adventOfCode.v2021.day2.Dive
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class DiveTest {
    @Test
    fun `Test given in part 1`() {
        val movements = listOf(
            Pair(Direction.FORWARD, 5),
            Pair(Direction.DOWN, 5),
            Pair(Direction.FORWARD, 8),
            Pair(Direction.UP, 3),
            Pair(Direction.DOWN, 8),
            Pair(Direction.FORWARD, 2)
        )
        assertThat(Dive.partOne(movements)).isEqualTo(150)
    }

    @Test
    fun `Test given in part 2`() {
        val movements = listOf(
            Pair(Direction.FORWARD, 5),
            Pair(Direction.DOWN, 5),
            Pair(Direction.FORWARD, 8),
            Pair(Direction.UP, 3),
            Pair(Direction.DOWN, 8),
            Pair(Direction.FORWARD, 2)
        )
        assertThat(Dive.partTwo(movements)).isEqualTo(900)
    }
}