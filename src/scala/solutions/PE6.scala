package scala.solutions

import structures.core.PEApp
import scala.math.pow

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 7:00 PM
 */

object PE6 extends PEApp {
    run()
    def myAnswer : Any = {
        val upper = 100
        val sumOfSquares = (1 to upper) map (pow(_, 2)) sum
        val squareOfSum = pow((1 to upper).sum, 2)
        (squareOfSum - sumOfSquares).toInt
    }
}
