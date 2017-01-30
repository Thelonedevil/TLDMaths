package uk.tldcode.math.tldmaths.biginteger

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertFalse
import kotlin.test.assertTrue


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
    fun ToString(){
        assertEquals("1..10",(BigInteger.ONE..BigInteger.TEN).toString())
    }

    @Test
    fun ZeroStep(){
        assertFails{getProgressionLastElement(BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO)}
        assertFails{BigInteger.ONE .. BigInteger.TEN step BigInteger.ZERO}
    }
}