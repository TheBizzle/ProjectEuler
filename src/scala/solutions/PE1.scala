package scala.solutions

import structures.PEApp

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 1:38 PM
 */

object PE1 extends PEApp {
    run()
    def myAnswer = (0 until 1000) filter { case x => ((x % 3) == 0) || ((x % 5) == 0) } sum
}
