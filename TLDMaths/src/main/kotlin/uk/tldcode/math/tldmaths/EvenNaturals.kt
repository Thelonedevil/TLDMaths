package uk.tldcode.math.tldmaths

import java.math.BigInteger


object EvenNaturals : BigIntegerSequence {
    override fun invoke(): Sequence<BigInteger> = Naturals().filter { it % BigInteger("2") == BigInteger.ZERO }
}