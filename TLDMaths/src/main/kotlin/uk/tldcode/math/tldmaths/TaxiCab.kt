package uk.tldcode.math.tldmaths

import java.math.BigInteger
import java.util.*
import uk.tldcode.math.tldmaths.biginteger.*
class TaxiCab(val Entry: Map.Entry<BigInteger, List<List<BigInteger>>>, val Power : Int) {

    override fun toString(): String {
        return "${Entry.key} = ${Entry.value.map { it.joinToString("^$Power + ", "", "^$Power") }.joinToString(" = ")}"
    }
    val key = Entry.key
    val value = Entry.value
    companion object{
        operator fun invoke(power: Int, amount: Int, ways: Int): TaxiCab? {
            return taxiCabImpl(power, amount, ways, Byte.MAX_VALUE.toLong())
        }

        tailrec private fun taxiCabImpl(power: Int, amount: Int, ways: Int, max: Long): TaxiCab? {
            val results = getSubsets((1L..max).map {
                BigInteger.valueOf(it)
            }.toList(), amount).map {
                it.map { it.pow(power) }.fold(BigInteger.ZERO) { a, b -> a + b } to it
            }.groupBy { it.first }.map { it.key to it.value.map { it.second }.toList() }.toMap()
            val smallest = results.filter { it.value.size >= ways }.minBy { it.key }
            if (smallest != null) {
                return TaxiCab(smallest,power)
            } else if (max < Long.MAX_VALUE) {
                (results as LinkedHashMap).clear()
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
}
