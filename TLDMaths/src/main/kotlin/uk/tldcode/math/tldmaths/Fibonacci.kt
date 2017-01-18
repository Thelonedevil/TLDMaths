package uk.tldcode.math.tldmaths

import generate.generate
import java.math.BigInteger

object Fibonacci {
    operator fun invoke(): Sequence<BigInteger> = generate {
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