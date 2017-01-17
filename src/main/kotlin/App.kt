fun main(args: Array<String>) {
    println(TaxiCab(4, 2, 2).toString())
   // (1..4).forEach {a-> (2..4).forEach {b-> (2..10).forEach {c-> println("TaxiCab($a,$b,$c) = ${TaxiCab(a,b,c).toString()}") } } }
}
