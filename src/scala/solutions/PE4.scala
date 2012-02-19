package scala.solutions

import structures.core.PEApp
import scala.math.pow

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 5:04 PM
 */

object PE4 extends PEApp {

    run()
    def myAnswer = findIt(3)

    def findIt(digits: Int) : Int = {
        val (l, h) = rangeByDigits(digits)
        val baseRange = (l to h)
        val queryRange = (l * l to h * h) filter { case x => baseRange exists (x % _ == 0) } reverse // Only hold onto numbers that have at least one three-digit factor
        val pals = generatePalindromes(l * l, h * h).reverse
        pals.collectFirst { case x if (queryRange.contains(x) && (findMatch(x, baseRange, h) != None)) => x }.get
    }

    def findMatch(target: Int, base: Range, maxFactor: Int) : Option[(Int, Int)] = {
        val factoredPairs = base map { case x => (x, target / x) } filter { case x => (x._2 <= maxFactor) && ((target % x._1) == 0) }
        if (factoredPairs.size == 0)
            None
        else
            Option(factoredPairs.head)
    }

    def rangeByDigits(digits: Int) : (Int, Int) = {
        (pow(10, digits - 1).toInt, (pow(10, digits).toInt - 1))
    }

    def generatePalindromes(lowerBound: Int = 0, upperBound: Int) : List[Int] = {
        (lowerBound to upperBound) filter (fits(_)) toList
    }

    def fits(num: Int) : Boolean = {
        num.toString == num.toString.reverse
    }

}
