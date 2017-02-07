package uk.tldcode.math.tldmaths


import sequence.buildSequence
import uk.tldcode.math.tldmaths.biginteger.inc
import java.math.BigInteger

object A000142 : BigIntegerSequence {
    override fun invoke(): Sequence<BigInteger> = buildSequence{
        var n = BigInteger.ZERO
        while (true) {
            yield(Factorial(n))
            n++
        }
    }
}