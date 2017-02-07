package uk.tldcode.math.tldmaths

import sequence.buildSequence
import uk.tldcode.math.tldmaths.biginteger.inc
import java.math.BigInteger


object Naturals : BigIntegerSequence {
    override fun invoke(): Sequence<BigInteger> = buildSequence {
        yield(BigInteger.ZERO)
        var n = BigInteger.ONE
        while (true) {
            yield(n)
            n++

        }
    }
}