package uk.tldcode.math.tldmaths.biginteger

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class OperatorsTest {

    @Test
    fun DecrementTest(){
        var result = BigInteger.TEN
        result--
        assertEquals(BigInteger.valueOf(9),result)
    }
    @Test
    fun IncrementTest(){
        var result = BigInteger.TEN
        result++
        assertEquals(BigInteger.valueOf(11),result)
    }
    @Test
    fun RangeToTest(){
        val result = (BigInteger.ONE..BigInteger.TEN)
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10",result.joinToString(", "))
    }
    @Test
    fun UntilTest(){
        val result = (BigInteger.ONE until BigInteger.TEN)
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9",result.joinToString(", "))
    }
    @Test
    fun DownToTest(){
        val result = (BigInteger.TEN downTo  BigInteger.ONE)
        assertEquals("10, 9, 8, 7, 6, 5, 4, 3, 2, 1",result.joinToString(", "))
    }
    @Test
    fun DowntilTest(){
        val result = (BigInteger.TEN downtil BigInteger.ONE)
        assertEquals("10, 9, 8, 7, 6, 5, 4, 3, 2",result.joinToString(", "))
    }
}