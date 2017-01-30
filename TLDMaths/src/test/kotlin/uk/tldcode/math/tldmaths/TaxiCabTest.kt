package uk.tldcode.math.tldmaths


import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class TaxiCabTest {
    @Test
    fun TaxiCabToString(){
        val result= TaxiCab(3,2,2)
        assertEquals("1729 = 1^3 + 12^3 = 9^3 + 10^3",result.toString())
    }
    @Test fun TaxiCab122() {
        val result = TaxiCab(1, 2, 2)
        assertEquals(BigInteger.valueOf(4L), result?.key)

    }

    @Test fun TaxiCab222() {
        val result = TaxiCab(2, 2, 2)
        assertEquals(BigInteger.valueOf(50L), result?.key)

    }

    @Test fun TaxiCab322() {
        val result = TaxiCab(3, 2, 2)
        assertEquals(BigInteger.valueOf(1729L), result?.key)
    }

    @Test fun TaxiCab422() {
        val result = TaxiCab(4, 2, 2)
        assertEquals(BigInteger.valueOf(635318657L), result?.key)
    }

    @Test fun TaxiCab133() {
        val result = TaxiCab(1, 3, 3)
        assertEquals(BigInteger.valueOf(9L), result?.key)

    }

    @Test fun TaxiCab233() {
        val result = TaxiCab(2, 3, 3)
        assertEquals(BigInteger.valueOf(101L), result?.key)

    }

    @Test fun TaxiCab333() {
        val result = TaxiCab(3, 3, 3)
        assertEquals(BigInteger.valueOf(5104L), result?.key)

    }

    @Test fun TaxiCab433() {
        val result = TaxiCab(4, 3, 3)
        assertEquals(BigInteger.valueOf(811538L), result?.key)

    }

    @Test fun TaxiCab321() {
        val result = TaxiCab(3, 2, 1)
        assertEquals(BigInteger.valueOf(2L), result?.key)

    }

    @Test fun TaxiCab323() {
        val result = TaxiCab(3, 2, 3)
        assertEquals(BigInteger.valueOf(87539319L), result?.key)

    }

}
