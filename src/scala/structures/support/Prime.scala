package scala.structures.support

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 7:40 PM
 */

object Prime {

    def isPrime(n: Int) : Boolean = {
        if(n == 1)
            false
        for (i <- 2 until n if (i * i <= n)) {
            if((n % i) == 0)
                return false
        }
        true
    }

}
