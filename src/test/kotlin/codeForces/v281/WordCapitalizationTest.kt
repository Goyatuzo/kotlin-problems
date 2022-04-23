package codeForces.v281

import kotlin.test.assertEquals
import org.junit.jupiter.api.Test

class WordCapitalizationTest {
    @Test
    fun `ApPLe results in ApPLe`() {
        assertEquals("ApPLe", WordCapitalization.solve("ApPLe"))
    }

    @Test
    fun `konjac results in Konjac`() {
        assertEquals("Konjac", WordCapitalization.solve("konjac"))
    }
}
