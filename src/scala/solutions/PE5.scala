package scala.solutions

import structures.core.PEApp

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 6:48 PM
 */

object PE5 extends PEApp {
    run()
    def myAnswer : Any = {
        val upper = 20
        def numStream(leapBy: Int, previous: Int = 0) : Stream[Int] = {
            val result = previous + leapBy
            result #:: numStream (leapBy, result)
        }
        numStream(upper) dropWhile { case x => (1 to upper) exists (x % _ != 0) } head
    }
}
