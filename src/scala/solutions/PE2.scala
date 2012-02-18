package scala.solutions

import structures.PEApp

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 2:13 PM
 */

object PE2 extends PEApp {
    run()
    def myAnswer = fibStream() takeWhile(_ < 4E6.toInt) filter (_ % 2 == 0) sum
    def fibStream(a: Int = 1, b: Int = 2) : Stream[Int] = a #:: fibStream(b, a + b)
}
