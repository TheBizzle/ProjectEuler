package scala.structures

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 1:42 PM
 */

abstract class PEApp(testNum: Int) extends App {

    def run() {
        val testNum = generateTestNum
        val got = myAnswer.toString
        val expected = PEAnswers(testNum)
        println("#" + testNum + ":\nGot: " + got + "\nExpected: " + expected + '\n' + {if (got == expected) "CORRECT" else "YOU ARE VERY, VERY WRONG"} + '\n')
    }

    def myAnswer : Any

    private def generateTestNum : Int = {
        
    }

}
