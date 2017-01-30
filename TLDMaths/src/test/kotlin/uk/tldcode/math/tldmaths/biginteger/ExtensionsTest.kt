package uk.tldcode.math.tldmaths.biginteger

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class ExtensionsTest {
    @Test
    fun BigCount(){
        val list = (BigInteger.ZERO..BigInteger.valueOf(Short.MAX_VALUE.toLong())+BigInteger.ONE)
        assertEquals(BigInteger.valueOf(Short.MAX_VALUE.toLong())+BigInteger.valueOf(2L),list.bigCount())
        assertEquals(BigInteger.valueOf(16385L),list.bigCount { it% BigInteger.valueOf(2L) == BigInteger.ZERO })
    }
}