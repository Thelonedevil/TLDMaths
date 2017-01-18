import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestName
import java.math.BigInteger
import kotlin.test.assertEquals


class TaxiCabTest {

    @Rule @JvmField
    var name = TestName()

    private var start: Long = 0
    private var result: TaxiCab? = null

    @Before
    fun start() {
        start = System.currentTimeMillis()
        print(name.methodName)
    }

    @After
    fun end() {
        println(" = ${result?.key},took ${System.currentTimeMillis() - start} ms")

    }

    @Test fun TaxiCab122() {
        result = TaxiCab(1, 2, 2)
        assertEquals(BigInteger.valueOf(4L), result?.key)

    }

    @Test fun TaxiCab222() {
        result = TaxiCab(2, 2, 2)
        assertEquals(BigInteger.valueOf(50L), result?.key)

    }

    @Test fun TaxiCab322() {
        result = TaxiCab(3, 2, 2)
        assertEquals(BigInteger.valueOf(1729L), result?.key)
    }

    @Test fun TaxiCab422() {
        result = TaxiCab(4, 2, 2)
        assertEquals(BigInteger.valueOf(635318657L), result?.key)
    }

    @Test fun TaxiCab133() {
        result = TaxiCab(1, 3, 3)
        assertEquals(BigInteger.valueOf(9L), result?.key)

    }

    @Test fun TaxiCab233() {
        result = TaxiCab(2, 3, 3)
        assertEquals(BigInteger.valueOf(101L), result?.key)

    }

    @Test fun TaxiCab333() {
        result = TaxiCab(3, 3, 3)
        assertEquals(BigInteger.valueOf(5104L), result?.key)

    }

    @Test fun TaxiCab433() {
        result = TaxiCab(4, 3, 3)
        assertEquals(BigInteger.valueOf(811538L), result?.key)

    }

    @Test fun TaxiCab321() {
        result = TaxiCab(3, 2, 1)
        assertEquals(BigInteger.valueOf(2L), result?.key)

    }

    @Test fun TaxiCab323() {
        result = TaxiCab(3, 2, 3)
        assertEquals(BigInteger.valueOf(87539319L), result?.key)

    }

}
