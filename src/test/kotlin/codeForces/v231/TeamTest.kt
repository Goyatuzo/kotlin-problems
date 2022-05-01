package codeForces.v231

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class TeamTest {
    @Test
    fun `first sample returns 2`() {
        assertThat(Team.solve(listOf(listOf(1, 1, 0), listOf(1, 1, 1), listOf(1, 0, 0))))
            .isEqualTo(2)
    }

    @Test
    fun `second sample returns 1`() {
        assertThat(Team.solve(listOf(listOf(1, 0, 0), listOf(0, 1, 1)))).isEqualTo(1)
    }
}
