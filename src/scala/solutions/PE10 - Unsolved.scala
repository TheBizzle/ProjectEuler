package scala.solutions

import structures.core.PEApp
import structures.support.PrimeSieve

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/19/12
 * Time: 11:46 AM
 */

object PE10 extends PEApp {
    run()
    def myAnswer = PrimeSieve.sieve_erat(2E6.toInt) sum
}
