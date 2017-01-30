package uk.tldcode.math.tldmaths

import java.math.BigInteger


object Coprime {
    operator fun invoke(a:BigInteger,b:BigInteger):Boolean = GCD(a,b) == BigInteger.ONE
}