package uk.tldcode.math.tldmaths

import uk.tldcode.math.tldmaths.biginteger.*
import java.math.BigInteger

fun main(args: Array<String>) {
    println(Fibonacci().take(100).joinToString(", "))
    println(A008233().take(100).joinToString(", "))
    println(A049329().take(100).joinToString(", "))
    println((BigInteger.ONE..BigInteger.TEN).joinToString(", "))
    println((BigInteger.ONE..BigInteger.TEN step BigInteger.valueOf(2)).joinToString(", "))
    println((BigInteger.TEN downTo BigInteger.ONE).joinToString(", "))
    println((BigInteger.TEN downTo BigInteger.ONE step BigInteger.valueOf(2)).joinToString(", "))
    println((BigInteger.ONE until BigInteger.TEN).joinToString(", "))
    println((BigInteger.ONE until BigInteger.TEN step BigInteger.valueOf(2)).joinToString(", "))
    println((BigInteger.TEN downtil BigInteger.ONE).joinToString(", "))
    println((BigInteger.TEN downtil BigInteger.ONE step BigInteger.valueOf(2)).joinToString(", "))

}
