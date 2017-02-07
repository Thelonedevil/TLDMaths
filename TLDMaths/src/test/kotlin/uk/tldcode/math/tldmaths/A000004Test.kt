package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class A000004Test {
    @Test
    fun A000004_100(){
        val result = A000004(100)
        assertEquals(BigInteger.ZERO,result)
    }
    @Test
    fun A000004_20(){
        val result = A000004(20)
        assertEquals(BigInteger.ZERO,result)
    }
}