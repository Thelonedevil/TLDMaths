package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class A000142Test {
    @Test
    fun A000142_100(){
        val result = A000142(100)
        assertEquals(BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"),result)
    }
    @Test
    fun A000142_20(){
        val result = A000142(20)
        assertEquals(BigInteger("2432902008176640000"),result)
    }
}