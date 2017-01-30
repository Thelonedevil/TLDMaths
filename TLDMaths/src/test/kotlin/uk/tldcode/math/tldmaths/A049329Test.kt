package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class A049329Test {
    @Test
    fun A049329_100(){
        val result = A049329(100)
        assertEquals(BigInteger.valueOf(202),result)
    }
    @Test
    fun A049329_20(){
        val result = A049329(20)
        assertEquals(BigInteger.valueOf(39),result)
    }
}