package uk.tldcode.math.tldmaths

import java.math.BigInteger


interface BigIntegerSequence {
    operator fun invoke(): Sequence<BigInteger>
    operator fun invoke(n: Int): BigInteger = invoke().take(n + 1).last()
}