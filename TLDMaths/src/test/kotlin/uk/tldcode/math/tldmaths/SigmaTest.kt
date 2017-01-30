package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class SigmaTest {
    @Test
    fun Sigma_100(){
        val result = Sigma(BigInteger.valueOf(100))
        assertEquals(BigInteger.valueOf(5050),result)
    }
    @Test
    fun Sigma_20(){
        val result = Sigma(BigInteger.valueOf(20))
        assertEquals(BigInteger.valueOf(210),result)
    }
}