package uk.tldcode.math.tldmaths.biginteger

import java.math.BigInteger


operator fun BigInteger.inc(): BigInteger = this + BigInteger.ONE
operator fun BigInteger.dec(): BigInteger = this - BigInteger.ONE
operator fun BigInteger.rangeTo(other: BigInteger): BigIntegerRange = BigIntegerRange(this, other)
infix fun BigInteger.until(other: BigInteger): BigIntegerRange = this..other - BigInteger.ONE
infix fun BigInteger.downTo(other: BigInteger): BigIntegerProgression = BigIntegerProgression.fromClosedRange(this, other, BigInteger.valueOf(-1))
infix fun BigInteger.downtil(other: BigInteger): BigIntegerProgression = this downTo other + BigInteger.ONE


