package uk.tldcode.math.tldmaths

import sequence.buildSequence
import java.math.BigInteger

object Fibonacci : BigIntegerSequence {
    override operator fun invoke(): Sequence<BigInteger> = buildSequence {
        yield(BigInteger.ZERO)
        yield(BigInteger.ONE) // first Fibonacci number
        var cur = BigInteger.ONE
        var next = BigInteger.ONE
        while (true) {
            yield(next) // next Fibonacci number
            val tmp = cur + next
            cur = next
            next = tmp
        }
    }
}