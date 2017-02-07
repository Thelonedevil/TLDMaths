package sequence

import kotlin.coroutines.experimental.*

@RestrictsSuspension
interface SequenceBuilder<in T> {
    suspend fun yield(value: T)
}

fun <T> buildSequence(block: suspend SequenceBuilder<T>.() -> Unit): Sequence<T> = Sequence {
    SequenceCoroutine<T>().apply {
        nextStep = block.createCoroutine(receiver = this, completion = this)
    }
}

private class SequenceCoroutine<T>() : AbstractIterator<T>(), SequenceBuilder<T>, Continuation<Unit> {
    override val context: CoroutineContext
        get() = EmptyCoroutineContext
    lateinit var nextStep: Continuation<Unit>

    // AbstractIterator implementation
    override fun computeNext() {
        nextStep.resume(Unit)
    }

    // Completion continuation implementation
    override fun resume(value: Unit) {
        done()
    }

    override fun resumeWithException(exception: Throwable) {
        throw exception
    }

    // Generator implementation
    override suspend fun yield(value: T) {
        setNext(value)
        return suspendCoroutine { c -> nextStep = c }
    }
}
