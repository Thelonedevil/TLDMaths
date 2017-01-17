import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals

class TaxiCabTest {
    @Test fun TaxiCab122() {
        val result = TaxiCab(1, 2, 2)
        assertEquals(BigInteger.valueOf(4L),result?.key)

    }
    @Test fun TaxiCab222() {
        val result = TaxiCab(2, 2, 2)
        assertEquals(BigInteger.valueOf(50L),result?.key)

    }
    @Test fun TaxiCab322() {
        val result = TaxiCab(3, 2, 2)
        assertEquals(BigInteger.valueOf(1729L),result?.key)

    }
    @Test fun TaxiCab422() {
        val result = TaxiCab(4, 2, 2)
        assertEquals(BigInteger.valueOf(635318657L),result?.key)

    }
    @Test fun TaxiCab133() {
        val result = TaxiCab(1, 3, 3)
        assertEquals(BigInteger.valueOf(9L),result?.key)

    }
    @Test fun TaxiCab233() {
        val result = TaxiCab(2, 3, 3)
        assertEquals(BigInteger.valueOf(101L),result?.key)

    }
    @Test fun TaxiCab333() {
        val result = TaxiCab(3, 3, 3)
        assertEquals(BigInteger.valueOf(5104L),result?.key)

    }
    @Test fun TaxiCab433() {
        val result = TaxiCab(4, 3, 3)
        assertEquals(BigInteger.valueOf(811538L),result?.key)

    }
    @Test fun TaxiCab144() {
        val result = TaxiCab(1, 4, 4)
        assertEquals(BigInteger.valueOf(14L),result?.key)

    }
    @Test fun TaxiCab244() {
        val result = TaxiCab(2, 4, 4)
        assertEquals(BigInteger.valueOf(126L),result?.key)

    }
    @Test fun TaxiCab344() {
        val result = TaxiCab(3, 4, 4)
        assertEquals(BigInteger.valueOf(4445L),result?.key)

    }
    @Test fun TaxiCab444() {
        val result = TaxiCab(4, 4, 4)
        assertEquals(BigInteger.valueOf(300834L),result?.key)

    }
}
