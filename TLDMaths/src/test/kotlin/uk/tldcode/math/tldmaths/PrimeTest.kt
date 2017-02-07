package uk.tldcode.math.tldmaths

import org.junit.Test
import kotlin.test.assertEquals


class PrimeTest {
    @Test
    fun Primes_20() {
        assertEquals("2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71", Prime().take(20).joinToString(", "))
    }

}