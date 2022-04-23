package projectEuler.p18

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class MaximumPathSumITest {
    @Test
    fun `Given triangle equals 23`() {
        val t = """3
            7 4
            2 4 6
            8 5 9 3
        """.trimIndent()

        val triangle = t.split('\n').map { it.trim().split(' ').map { it.toInt() } }
        assertThat(MaximumPathSumI.triangle(triangle)).isEqualTo(23)
    }
}
