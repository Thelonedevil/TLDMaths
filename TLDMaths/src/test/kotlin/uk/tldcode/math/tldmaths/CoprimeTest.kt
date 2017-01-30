package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertFalse
import kotlin.test.assertTrue


class CoprimeTest {
    @Test
    fun Coprime_14_15(){
        val result = Coprime(BigInteger.valueOf(14), BigInteger.valueOf(15))
        assertTrue(result)
    }
    @Test
    fun Coprime_14_21(){
        val result = Coprime(BigInteger.valueOf(14), BigInteger.valueOf(21))
        assertFalse(result)
    }
}