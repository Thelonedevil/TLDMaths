package uk.tldcode.math.tldmaths

import java.math.BigInteger


object OddNaturals : BigIntegerSequence {
    override fun invoke(): Sequence<BigInteger> = Naturals().filter { it % BigInteger("2") == BigInteger.ONE }
}