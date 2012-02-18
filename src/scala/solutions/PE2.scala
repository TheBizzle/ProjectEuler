package scala.solutions

import structures.core.PEApp
import structures.support.FibStream

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 2:13 PM
 */

object PE2 extends PEApp {
    run()
    def myAnswer = FibStream() takeWhile(_ < 4E6.toInt) filter (_ % 2 == 0) sum
}
