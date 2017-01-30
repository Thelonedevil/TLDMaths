package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class GCDTest {
    @Test
    fun GCD_54_24Test(){
        val result = GCD(BigInteger.valueOf(54), BigInteger.valueOf(24))
        assertEquals(BigInteger.valueOf(6),result)

    }
    @Test
    fun GCD_17_31(){
        val result = GCD(BigInteger.valueOf(17), BigInteger.valueOf(31))
        assertEquals(BigInteger.valueOf(1),result)
    }
}