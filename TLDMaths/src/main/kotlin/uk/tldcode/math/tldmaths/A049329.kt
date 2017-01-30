package uk.tldcode.math.tldmaths

import generate.generate
import uk.tldcode.math.tldmaths.biginteger.inc
import java.math.BigInteger


object A049329 : BigIntegerSequence {
    override operator fun invoke(): Sequence<BigInteger> = generate {
        yield(BigInteger.ZERO)
        var n = BigInteger.ONE
        yield(n)
        while (n < BigInteger.valueOf(Int.MAX_VALUE.toLong()) + BigInteger.ONE) {
            n++
            if (n.pow(n.toInt()).toString(10).contains(n.toString(10))) {
                yield(n)
            }
        }
    }
}