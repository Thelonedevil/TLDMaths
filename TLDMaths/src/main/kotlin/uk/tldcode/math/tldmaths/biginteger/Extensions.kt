package uk.tldcode.math.tldmaths.biginteger

import java.math.BigInteger


/**
 * Returns the number of elements matching the given [predicate].
 */
inline fun <T> Iterable<T>.bigCount(predicate: (T) -> Boolean): BigInteger {
    var count = BigInteger.ZERO
    this.filter { predicate(it) }.forEach { count++ }
    return count
}
fun <T> Iterable<T>.bigCount(): BigInteger {
    return this.bigCount { true }
}