package adventOfcode.v2021.day3

import adventOfCode.v2021.day3.BinaryDiagnostic
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class BinaryDiagnosticTest {
    @Test
    fun `Test given 1`() {
        assertThat(BinaryDiagnostic.partOne(listOf(
            "00100",
            "11110",
            "10110",
            "10111",
            "10101",
            "01111",
            "00111",
            "11100",
            "10000",
            "11001",
            "00010",
            "01010",
        ))).isEqualTo(198.toUInt())
    }
}