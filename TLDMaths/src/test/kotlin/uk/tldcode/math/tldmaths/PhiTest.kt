package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class PhiTest {
    @Test
    fun Phi_9(){
        val result = Phi(BigInteger.valueOf(9))
        assertEquals(BigInteger.valueOf(6),result)
    }
}