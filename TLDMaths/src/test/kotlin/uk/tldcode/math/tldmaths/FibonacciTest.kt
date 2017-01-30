package uk.tldcode.math.tldmaths

import org.junit.Test
import java.math.BigInteger
import kotlin.test.assertEquals


class FibonacciTest {

    @Test
    fun Fibonacci_100(){
        val result = Fibonacci(100)
        assertEquals(BigInteger("354224848179261915075"),result)
    }
    @Test
    fun Fibonacci_20(){
        val result = Fibonacci(20)
        assertEquals(BigInteger.valueOf(6765L),result)
    }
    @Test
    fun Fibonacci_100List(){
        val result = Fibonacci().take(100).toList()
        val expected = listOf(BigInteger("0"), BigInteger("1"), BigInteger("1"), BigInteger("2"), BigInteger("3"), BigInteger("5"), BigInteger("8"), BigInteger("13"), BigInteger("21"), BigInteger("34"), BigInteger("55"), BigInteger("89"), BigInteger("144"), BigInteger("233"), BigInteger("377"), BigInteger("610"), BigInteger("987"), BigInteger("1597"), BigInteger("2584"), BigInteger("4181"), BigInteger("6765"), BigInteger("10946"), BigInteger("17711"), BigInteger("28657"), BigInteger("46368"), BigInteger("75025"), BigInteger("121393"), BigInteger("196418"), BigInteger("317811"), BigInteger("514229"), BigInteger("832040"), BigInteger("1346269"), BigInteger("2178309"), BigInteger("3524578"), BigInteger("5702887"), BigInteger("9227465"), BigInteger("14930352"), BigInteger("24157817"), BigInteger("39088169"), BigInteger("63245986"), BigInteger("102334155"), BigInteger("165580141"), BigInteger("267914296"), BigInteger("433494437"), BigInteger("701408733"), BigInteger("1134903170"), BigInteger("1836311903"), BigInteger("2971215073"), BigInteger("4807526976"), BigInteger("7778742049"), BigInteger("12586269025"), BigInteger("20365011074"), BigInteger("32951280099"), BigInteger("53316291173"), BigInteger("86267571272"), BigInteger("139583862445"), BigInteger("225851433717"), BigInteger("365435296162"), BigInteger("591286729879"), BigInteger("956722026041"), BigInteger("1548008755920"), BigInteger("2504730781961"), BigInteger("4052739537881"), BigInteger("6557470319842"), BigInteger("10610209857723"), BigInteger("17167680177565"), BigInteger("27777890035288"), BigInteger("44945570212853"), BigInteger("72723460248141"), BigInteger("117669030460994"), BigInteger("190392490709135"), BigInteger("308061521170129"), BigInteger("498454011879264"), BigInteger("806515533049393"), BigInteger("1304969544928657"), BigInteger("2111485077978050"), BigInteger("3416454622906707"), BigInteger("5527939700884757"), BigInteger("8944394323791464"), BigInteger("14472334024676221"), BigInteger("23416728348467685"), BigInteger("37889062373143906"), BigInteger("61305790721611591"), BigInteger("99194853094755497"), BigInteger("160500643816367088"), BigInteger("259695496911122585"), BigInteger("420196140727489673"), BigInteger("679891637638612258"), BigInteger("1100087778366101931"), BigInteger("1779979416004714189"), BigInteger("2880067194370816120"), BigInteger("4660046610375530309"), BigInteger("7540113804746346429"), BigInteger("12200160415121876738"), BigInteger("19740274219868223167"), BigInteger("31940434634990099905"), BigInteger("51680708854858323072"), BigInteger("83621143489848422977"), BigInteger("135301852344706746049"), BigInteger("218922995834555169026"))
        assertEquals(expected,result)
    }
}