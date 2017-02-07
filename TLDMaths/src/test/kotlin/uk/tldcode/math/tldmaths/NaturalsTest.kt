package uk.tldcode.math.tldmaths

import org.junit.Test
import kotlin.test.assertEquals


class NaturalsTest {
    @Test
    fun Naturals_20(){
        assertEquals("0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19",Naturals().take(20).joinToString(", "))
    }
    @Test
    fun EvenNaturals_20(){
        assertEquals("0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38",EvenNaturals().take(20).joinToString(", "))
    }
}