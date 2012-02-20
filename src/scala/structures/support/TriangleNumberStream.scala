package scala.structures.support

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/19/12
 * Time: 5:45 PM
 */

object TriangleNumberStream {
    def apply(num: Int = 1, previous: Int = 0) : Stream[Int] = (num + previous) #:: apply(num + 1, num + previous)
}
