package uk.tldcode.math.tldmaths

import sequence.buildSequence
import java.math.BigInteger


object A000004 : BigIntegerSequence {
    override fun invoke(): Sequence<BigInteger> = buildSequence {
        while (true) {
            yield(BigInteger.ZERO)
        }
    }
}