package projectEuler.p25

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class EulerFibonacciNumberTest {
    @Test
    fun `12 should be first number with three digits`() {
        assertThat(EulerFibonacciNumber.solve(3)).isEqualTo(12)
    }
}