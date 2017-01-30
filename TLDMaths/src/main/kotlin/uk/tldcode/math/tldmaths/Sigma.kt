package uk.tldcode.math.tldmaths

import java.math.BigInteger
import uk.tldcode.math.tldmaths.biginteger.*

object Sigma {
    operator fun invoke(n: BigInteger) : BigInteger {
        return (n * (n + BigInteger.ONE)) / BigInteger.valueOf(2)
    }
}