package uk.tldcode.math.tldmaths

import generate.generate
import java.math.BigInteger
import java.math.BigInteger.ONE
import uk.tldcode.math.tldmaths.biginteger.*

object A008233 : BigIntegerSequence {
    override operator fun invoke(): Sequence<BigInteger> = generate {
        var n = BigInteger.ZERO
        while (true) {
            yield((n / BigInteger.valueOf(4)) * ((n + ONE) / BigInteger.valueOf(4)) * ((n + BigInteger.valueOf(2)) / BigInteger.valueOf(4)) * ((n + BigInteger.valueOf(3)) / BigInteger.valueOf(4)))
            n++
        }
    }
}
