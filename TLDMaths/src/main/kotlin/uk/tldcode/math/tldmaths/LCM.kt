package uk.tldcode.math.tldmaths

import java.math.BigInteger


object LCM {
    operator fun invoke(a: BigInteger, b: BigInteger): BigInteger {
        if(a == BigInteger.ZERO && b == BigInteger.ZERO){
            return a
        }
        return a*b/GCD(a,b)
    }
}