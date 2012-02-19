package scala.solutions

import structures.core.PEApp
import scala.math.{pow, sqrt}

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/19/12
 * Time: 10:47 AM
 */

object PE9 extends PEApp {

    run()
    def myAnswer = {
        val logicalBound = 500
        val abPair = (1 until logicalBound) collect { case x => (x, { (x + 1 to logicalBound) collectFirst { case y if (y.toDouble == (1000 * (x.toDouble - 500) / (x.toDouble - 1000))) => y } }) } collect { case (a, Some(b)) => (a, b) }
        val abcTriplet = abPair map { case x => (x._1, x._2, (sqrt(pow(x._1, 2) + pow (x._2, 2)))) } collect { case (a,b,c) if (c.toString.endsWith(".0")) => (a,b,c.toInt) }
        abcTriplet map { case (a,b,c) => a * b * c } head
    }

}
