package codeForces.v281

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

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