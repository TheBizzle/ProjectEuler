package scala.structures.support

import annotation.tailrec

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 7:07 PM
 */

object PrimeGenerator {
    def apply() : Stream[Int] = {
        def primeStream(lastNum: Int = -1, doing2: Boolean = false) : Stream[Int] = {
            @tailrec def generatePrime(num: Int) : Int = {
                if (Prime.isPrime(num))
                    num
                else
                    generatePrime(num + 2)
            }
            val result = {
                if (lastNum == -1)
                    2
                else if (lastNum == 2)
                    3
                else
                    generatePrime(lastNum + 2)
            }
            result #:: primeStream(result, !doing2)
        }
        primeStream()
    }
}
