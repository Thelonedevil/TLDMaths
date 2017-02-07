package uk.tldcode.math.tldmaths.biginteger

import org.junit.Test
import java.math.BigInteger
import kotlin.test.*


class RangesTest {
    @Test
    fun EmptyTest() {
        assertTrue((BigInteger.ONE..BigInteger.ZERO).isEmpty())
        assertTrue((BigInteger.ZERO downTo BigInteger.ONE).isEmpty())
        assertFalse((BigInteger.ZERO..BigInteger.ONE).isEmpty())
        assertFalse((BigInteger.ONE downTo BigInteger.ZERO).isEmpty())
        assertTrue(BigIntegerRange.EMPTY.isEmpty())
    }

    @Test
    fun EqualsTest() {
        assertTrue((BigInteger.ONE..BigInteger.ZERO) == BigIntegerRange.EMPTY)
        assertTrue((BigInteger.ZERO..BigInteger.ONE) == (BigInteger.ZERO..BigInteger.ONE))
        assertFalse((BigInteger.ONE..BigInteger.ZERO).equals("not a range"))
        assertFalse((BigInteger.ONE..BigInteger.ZERO) == (BigInteger.ZERO..BigInteger.ONE))

        assertTrue((BigInteger.ZERO downTo  BigInteger.ONE) == BigIntegerRange.EMPTY)
        assertTrue((BigInteger.TEN downTo BigInteger.ZERO) == (BigInteger.TEN downTo BigInteger.ZERO))
        assertFalse((BigInteger.TEN downTo BigInteger.ZERO).equals("not a range"))
        assertFalse((BigInteger.TEN downTo BigInteger.ZERO) == (BigInteger.ZERO downTo BigInteger.TEN))
    }

    @Test
    fun GetStart() {
        assertEquals(BigInteger.ZERO, (BigInteger.ZERO..BigInteger.ONE).start)
    }

    @Test
    fun GetEndInclusive() {
        assertEquals(BigInteger.ONE, (BigInteger.ZERO..BigInteger.ONE).endInclusive)
    }

    @Test
    fun Contains(){
        assertTrue { BigInteger.ONE in BigInteger.ZERO..BigInteger.TEN }
        assertFalse { BigInteger.ZERO in BigInteger.ONE..BigInteger.TEN }
        assertFalse { BigInteger.TEN in BigInteger.ZERO..BigInteger.ONE }

    }
    @Test
    fun ToString(){
        assertEquals("1..10",(BigInteger.ONE..BigInteger.TEN).toString())
        assertEquals("0..10 step 2",(BigInteger.ZERO    ..BigInteger.TEN step BigInteger("2")).toString())
        assertEquals("10 downTo 0 step 1",(BigInteger.TEN downTo BigInteger.ZERO).toString())
    }
    @Test
    fun HashCode(){
        assertEquals((BigInteger.ZERO..BigInteger.ONE).hashCode(),(BigInteger.ZERO..BigInteger.ONE).hashCode())
        assertEquals((BigInteger.ONE..BigInteger.ZERO).hashCode(),(BigInteger.ONE..BigInteger.ZERO).hashCode())
        assertNotEquals((BigInteger.ZERO..BigInteger.ONE).hashCode(),(BigInteger.ZERO..BigInteger.TEN).hashCode())

        assertEquals((BigInteger.TEN downTo  BigInteger.ONE).hashCode(),(BigInteger.TEN downTo  BigInteger.ONE).hashCode())
        assertEquals((BigInteger.ONE downTo  BigInteger.TEN).hashCode(),(BigInteger.ONE downTo  BigInteger.TEN).hashCode())
        assertNotEquals((BigInteger.TEN downTo  BigInteger.ONE).hashCode(),(BigInteger.TEN downTo  BigInteger.TEN).hashCode())
    }

    @Test
    fun ZeroStep(){

        assertFails{getProgressionLastElement(BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO)}
        assertFails{BigInteger.ONE .. BigInteger.TEN step BigInteger.ZERO}
    }
    @Test
    fun Step(){
        val step = BigInteger("2")
        assertEquals(step,(BigInteger.ZERO..BigInteger.TEN step step).step)
        assertEquals(-step,(BigInteger.TEN downTo BigInteger.ZERO step step).step)
    }
}