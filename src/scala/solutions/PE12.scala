package scala.solutions

import structures.core.PEApp
import structures.support.TriangleNumberStream

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/19/12
 * Time: 5:44 PM
 */

object PE12 extends PEApp {

    run()
    def myAnswer = { val divisorCount = 500; TriangleNumberStream() dropWhile { case x => ((1 to x) count(x % _ == 0)) <= divisorCount } head }

}
