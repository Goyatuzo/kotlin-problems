package adventOfcode.v2018.day2

import adventOfCode.v2018.day2.InventoryManagementSystem
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class InventoryManagementSystemTest {
    @Test
    fun `P1 ('abcdef', 'bababc', 'abbcde') results in 2`() {
        assertEquals(2, InventoryManagementSystem.partOne(listOf("abcdef", "bababc", "abbcde")))
    }

    @Test
    fun `P1 ('abcdef', 'bababc', 'abbcde', 'abcccd', 'aabcdd', 'abcdee', 'ababab') results in 12`() {
        assertEquals(12, InventoryManagementSystem.partOne(listOf(
            "abcdef",
            "bababc",
            "abbcde",
            "abcccd",
            "aabcdd",
            "abcdee",
            "ababab"
        )))
    }

    @Test
    fun`P2 ('abcde', 'fghij', 'klmno', 'pqrst', 'fguij', 'axcye', 'wvxyz') results in 'fgij'`() {
        assertEquals("fgij", InventoryManagementSystem.partTwo(listOf(
            "abcde", "fghij", "klmno", "pqrst", "fguij", "axcye", "wvxyz"
        )))
    }
}