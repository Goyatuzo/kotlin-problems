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

    @Test
    fun `Test oxygen generator 2`() {
        assertThat(BinaryDiagnostic.oxygenGenerator(listOf(
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
        ))).isEqualTo(23.toUInt())
    }

    @Test
    fun `Test scrubber 2`() {
        assertThat(BinaryDiagnostic.scrubberRating(listOf(
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
        ))).isEqualTo(10.toUInt())
    }

    @Test
    fun `Test given 2`() {
        assertThat(BinaryDiagnostic.partTwo(listOf(
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
        ))).isEqualTo(230.toUInt())
    }
}