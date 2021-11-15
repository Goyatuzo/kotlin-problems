package projectEuler.p25

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class EulerFibonacciNumberTest {
    @Test
    fun `12 should be first number with three digits`() {
        assertThat(EulerFibonacciNumber.solve(3)).isEqualTo(12)
    }

    @Test
    fun `4782 should be the first number with 1000 digits`() {
        assertThat(EulerFibonacciNumber.solve(1000)).isEqualTo(4782)
    }
}