import java.math.BigInteger
import java.util.*

/*
fun main(args: Array<String>) {
    val smallest = TaxiCab.apply(1, 2, 2)
    println("${smallest?.key} = ${smallest?.value?.map { it.joinToString("^3 + ", "", "^3") }?.joinToString(" = ")}")
}*/

object TaxiCab {
    fun apply(power: Int, amount: Int, ways: Int): Map.Entry<BigInteger, List<List<BigInteger>>>? {
        return taxiCabImpl(power, amount, ways, Byte.MAX_VALUE.toLong())
    }

    tailrec private fun taxiCabImpl(power: Int, amount: Int, ways: Int, max: Long): Map.Entry<BigInteger, List<List<BigInteger>>>? {
        val results = getSubsets((1L..max).map {
            BigInteger.valueOf(it)
        }.toList(), amount).map {
            it.map { it.pow(power) }.fold(BigInteger.ZERO) { a, b -> a + b } to it
        }.groupBy { it.first }.map { it.key to it.value.map { it.second }.toList() }.toMap()
        //results.forEach { println("${it.first} = ${it.second.joinToString("^$power + ", "", "^$power")}") }
        val smallest = results.filter { it.value.size >= ways }.minBy { it.key }
        if (smallest != null) {
            return smallest
        } else if (max < Long.MAX_VALUE) {
            return taxiCabImpl(power, amount, ways, if (max * 2 > 0) max * 2 else Long.MAX_VALUE)
        } else {
            return null
        }


    }

    tailrec private fun <T> getSubsets(superSet: List<T>, k: Int, idx: Int, current: ArrayList<T>, solution: ArrayList<List<T>>) {

        //successful stop clause
        if (current.size == k) {
            solution.add(ArrayList(current))
            return
        }
        //unsuccessful stop clause
        if (idx == superSet.size) return
        val x = superSet[idx]
        current.add(x)
        //"guess" x is in the subset
        getSubsets(superSet, k, idx + 1, current, solution)
        current.remove(x)
        //"guess" x is not in the subset
        getSubsets(superSet, k, idx + 1, current, solution)
    }

    private fun <T> getSubsets(superSet: List<T>, k: Int): List<List<T>> {
        val res = ArrayList<List<T>>()
        getSubsets(superSet, k, 0, ArrayList<T>(), res)
        res.addAll(superSet.map { a -> (1..k).map { a }.toList() })
        return res
    }
}