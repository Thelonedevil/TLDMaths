package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class A008233Test {
    @Test
    fun A008233_100(){
        val result = A008233(100)
        assertEquals(BigInteger.valueOf(390625L),result)
    }
    @Test
    fun A008233_20(){
        val result = A008233(20)
        assertEquals(BigInteger.valueOf(625L),result)
    }
}