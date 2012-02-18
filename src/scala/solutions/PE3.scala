package scala.solutions

import structures.core.PEApp
import structures.support.PrimeSieve

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 2:59 PM
 */

object PE3 extends PEApp {
    run()
    def myAnswer = {
        val target = 13195L
        //val target = 600851475143L
        PrimeSieve(target).reverse dropWhile { case x => (target % x) != 0 } head
    }
}
