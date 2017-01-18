package uk.tldcode.math.tldmaths

import org.junit.After
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestName
import java.math.BigDecimal
import java.math.BigInteger
import kotlin.test.assertEquals


class FibonacciTest {
    @Rule @JvmField
    var name = TestName()

    private var start: Long = 0
    private var result: BigInteger? = null

    @Before
    fun start() {
        start = System.currentTimeMillis()
        print(name.methodName)
    }

    @After
    fun end() {
        println(" = $result,took ${System.currentTimeMillis() - start} ms")

    }
    @Test
    fun Fibonacci100(){
        result = Fibonacci().take(100).last()
        assertEquals(BigInteger("354224848179261915075"),result)
    }
    @Test
    fun Fibonacci20(){
        result = Fibonacci().take(20).last()
        assertEquals(BigInteger.valueOf(6765L),result)
    }
}