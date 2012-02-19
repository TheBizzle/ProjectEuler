package scala.structures.support

import annotation.tailrec

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 2:46 PM
 */

/** A Sieve of Atkin */
object PrimeSieve {
    
    def apply(target: Long) : List[Int] = {
        //primes(probe = 2L, limit = target).reverse
        primesPrime(target.toInt)
    }

//    @tailrec
//    def primes(inList: List[Long] = Nil, probe: Long, limit: Long) : List[Long] = {
//        if (probe > limit)
//            inList
//        else {
//            val neoList = {
//                if (inList.exists(probe % _ == 0))
//                    inList
//                else
//                    probe :: inList
//            }
//            primes(neoList, probe + 1, limit)
//        }
//    }

    // Sieve of Eratosthenes
    def sieve_erat(target: Int) : List[Int] = {
        @tailrec def sieveHelper(inList: List[Int], outList: List[Int]) : List[Int] = {
            inList match {
                case Nil  => outList reverse
                case h::t => sieveHelper(t filterNot (_ % h == 0), h :: outList)
            }
        }
        sieveHelper((2 to target).toList, Nil)
    }

    // Sieve of Eratosthenes (Attempt... 3?)
    def sieve_erat2(target: Int) : List[Int] = {
        (2 to target).toList.foldLeft(List[Int]()){ case (acc, x) => if (acc exists (x % _ == 0)) acc else x :: acc } reverse
    }

    def primesPrime(target: Int) : List[Int] = {

        val list41  = List(1, 13, 17, 29, 37, 41, 49, 53)
        val list31  = List(7, 19, 31, 43)
        val list31m = List(11, 23, 47, 59)

        def flip41(n: Int) {
            
        }

        def flip31(n: Int) {

        }

        def flip31m(n: Int) {
            
        }

        val arr = Array.fill(target.toInt)(false)

        @tailrec def lamb(counter: Int) : List[Int] = {
            (counter until arr.size) foreach {
                case x =>
                    val r = x % 60
                    //@ Ooops, I think I misunderstood the sieve....
                    if (list41 contains r)
                        flip41(x)
                    else if (list31 contains r)
                        flip31(x)
                    else if (list31m contains r)
                        flip31m(x)
            }
            lamb(counter + 1)
        }


        lamb(5)

        val props = (5 until arr.size).collect { case x if (arr(x)) => { val sqr = x*x; (2 to (arr.size / sqr).floor.toInt) map (_ * sqr) foreach (arr(_) = false); x } }.toList
        2 :: 3 :: props

    }

}
