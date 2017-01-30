package uk.tldcode.math.tldmaths

import java.math.BigInteger
import uk.tldcode.math.tldmaths.biginteger.*

object Phi {
    operator fun invoke(n: BigInteger):BigInteger{
        return (BigInteger.ONE..n).bigCount{Coprime(it,n)}
    }
}