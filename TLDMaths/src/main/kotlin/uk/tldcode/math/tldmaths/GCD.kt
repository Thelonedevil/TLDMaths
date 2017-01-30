package uk.tldcode.math.tldmaths

import java.math.BigInteger


object GCD {
    // recursive implementation of Euclidean algorithm
    operator fun invoke(a: BigInteger, b: BigInteger): BigInteger {
        if (b == BigInteger.ZERO)
            return a
        else
            return GCD(b, a % b)
    }

}