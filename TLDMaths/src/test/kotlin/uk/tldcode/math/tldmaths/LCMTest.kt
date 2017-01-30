package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class LCMTest {
    @Test
    fun LCM_54_24Test(){
        val result = LCM(BigInteger.valueOf(54), BigInteger.valueOf(24))
        assertEquals(BigInteger.valueOf(216),result)

    }
    @Test
    fun LCM_17_31(){
        val result = LCM(BigInteger.valueOf(17), BigInteger.valueOf(31))
        assertEquals(BigInteger.valueOf(527),result)
    }
    @Test
    fun LCM_0_0(){
        val result = LCM(BigInteger.valueOf(0), BigInteger.valueOf(0))
        assertEquals(BigInteger.valueOf(0),result)
    }
    @Test
    fun LCM_0_1(){
        val result = LCM(BigInteger.valueOf(0), BigInteger.valueOf(1))
        assertEquals(BigInteger.valueOf(0),result)
    }
}