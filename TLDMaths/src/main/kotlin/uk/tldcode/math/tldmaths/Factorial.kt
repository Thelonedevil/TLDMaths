package uk.tldcode.math.tldmaths

import java.math.BigInteger


object Factorial {
    operator fun invoke(n: BigInteger): BigInteger {
        return implementation(n, BigInteger.ONE)
    }
    private fun implementation(n:BigInteger,result:BigInteger): BigInteger{
        if(n > BigInteger.ZERO){
            return implementation(n - BigInteger.ONE, result * n)
        }
        return result
    }

}