package scala.solutions

import structures.core.PEApp
import structures.support.PrimeGenerator

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 7:13 PM
 */

object PE7 extends PEApp {
    run()
    def myAnswer = PrimeGenerator().drop(10000).head
}
