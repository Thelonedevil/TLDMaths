package uk.tldcode.math.tldmaths

import sequence.buildSequence
import java.math.BigInteger


object Prime : BigIntegerSequence {
    override fun invoke(): Sequence<BigInteger> = buildSequence {
        yield(BigInteger("2"))
        for (a in OddNaturals().filter { it.isProbablePrime(10) }.filter { firstFactor(it, Prime()) == null }) {
            yield(a)
        }
    }

    private fun firstFactor(num: BigInteger, search: Sequence<BigInteger>): BigInteger? {
        return search
                .takeWhile { i -> i * i <= num }
                .find { num % it == BigInteger.ZERO }
    }


}