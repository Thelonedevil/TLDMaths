package uk.tldcode.math.tldmaths.biginteger


import java.math.BigInteger


class BigIntegerRange(start: BigInteger, endInclusive: BigInteger) : BigIntegerProgression(start, endInclusive, BigInteger.ONE), ClosedRange<BigInteger> {
    override val start: BigInteger get() = first
    override val endInclusive: BigInteger get() = last
    override fun contains(value: BigInteger): Boolean = first <= value && value <= last

    override fun isEmpty(): Boolean = first > last

    override fun equals(other: Any?): Boolean =
            other is BigIntegerRange && (isEmpty() && other.isEmpty() ||
                    first == other.first && last == other.last)

    override fun hashCode(): Int {
        val prime = BigInteger.valueOf(31)
        return if (isEmpty()) -1 else (prime * first + last).toInt()
    }

    override fun toString(): String = "$first..$last"

    companion object {
        /** An empty range of values of type Int. */
        val EMPTY: BigIntegerRange = BigIntegerRange(BigInteger.ONE, BigInteger.ZERO)
    }
}

infix fun BigIntegerProgression.step(step: BigInteger): BigIntegerProgression {
    if (step <= BigInteger.ZERO) throw IllegalArgumentException("Step must be positive, was: $step")
    return BigIntegerProgression.fromClosedRange(first, last, if (this.step > BigInteger.ZERO) step else -step)
}

open class BigIntegerProgression
internal constructor
(
        start: BigInteger,
        endInclusive: BigInteger,
        step: BigInteger
) : Iterable<BigInteger> {
    init {
        if (step == BigInteger.ZERO) throw kotlin.IllegalArgumentException("Step must be non-zero")
    }

    /**
     * The first element in the progression.
     */
    val first: BigInteger = start

    /**
     * The last element in the progression.
     */
    val last: BigInteger = getProgressionLastElement(start, endInclusive, step)

    /**
     * The step of the progression.
     */
    val step: BigInteger = step

    override fun iterator(): BigIntegerIterator = BigIntegerProgressionIterator(first, last, step)

    /** Checks if the progression is empty. */
    open fun isEmpty(): Boolean = if (step > BigInteger.ZERO) first > last else first < last

    override fun equals(other: Any?): Boolean =
            other is BigIntegerProgression && (isEmpty() && other.isEmpty() ||
                    first == other.first && last == other.last && step == other.step)

    override fun hashCode(): Int {
        val prime = BigInteger.valueOf(31)
        return if (isEmpty()) -1 else (prime * (prime * first + last) + step).toInt()
    }

    override fun toString(): String = if (step > BigInteger.ZERO) "$first..$last step $step" else "$first downTo $last step ${-step}"

    companion object {
        fun fromClosedRange(rangeStart: BigInteger, rangeEnd: BigInteger, step: BigInteger): BigIntegerProgression = BigIntegerProgression(rangeStart, rangeEnd, step)
    }
}

abstract class BigIntegerIterator : Iterator<BigInteger> {
    override final fun next() = nextBigInteger()

    /** Returns the next value in the sequence without boxing. */
    public abstract fun nextBigInteger(): BigInteger
}

internal class BigIntegerProgressionIterator(first: BigInteger, last: BigInteger, val step: BigInteger) : BigIntegerIterator() {
    private var next = first
    private val finalElement = last
    private var hasNext: Boolean = if (step > BigInteger.ZERO) first <= last else first >= last

    override fun hasNext(): Boolean = hasNext

    override fun nextBigInteger(): BigInteger {
        val value = next
        if (value == finalElement) {
            hasNext = false
        } else {
            next += step
        }
        return value
    }
}

internal fun getProgressionLastElement(start: BigInteger, end: BigInteger, step: BigInteger): BigInteger {
    if (step > BigInteger.ZERO) {
        return end - differenceModulo(end, start, step)
    } else if (step < BigInteger.ZERO) {
        return end + differenceModulo(start, end, -step)
    } else {
        throw kotlin.IllegalArgumentException("Step is zero.")
    }
}

private fun mod(a: BigInteger, b: BigInteger): BigInteger {
    val mod = a % b
    return if (mod >= BigInteger.ZERO) mod else mod + b
}

// (a - b) mod c
private fun differenceModulo(a: BigInteger, b: BigInteger, c: BigInteger): BigInteger {
    return mod(mod(a, c) - mod(b, c), c)
}