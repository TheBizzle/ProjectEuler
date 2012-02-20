package scala.solutions

import structures.core.PEApp
import annotation.tailrec

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/19/12
 * Time: 6:18 PM
 */

object PE14 extends PEApp {
    
    run()
    def myAnswer = {
        (Iterator.iterate((0,List[Long](),0)){ case (a,b,c) => val list = createCollatzList(a + 1); if (list.size > c) (a + 1, list, list.size) else (a + 1, b, c) } drop (1E6 - 1).toInt).next()._2 head
    }

    def createCollatzList(num: Long) : List[Long] = {
        @tailrec def collatzHelper(num: Long, outList: List[Long] = Nil) : List[Long] = {
            if (num != 1) {
                val neoNum = {
                    if (num % 2 == 0) {
                        num / 2
                    }
                    else {
                        (3 * num) + 1
                    }
                }
                collatzHelper(neoNum, neoNum :: outList)
            }
            else
                outList reverse
        }
        num :: collatzHelper(num)
    }

}
