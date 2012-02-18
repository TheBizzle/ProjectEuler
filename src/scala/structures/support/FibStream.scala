package scala.structures.support

/**
 * Created by IntelliJ IDEA.
 * User: Jason
 * Date: 2/18/12
 * Time: 2:46 PM
 */

object FibStream {
    def apply(a: Int = 1, b: Int = 2) : Stream[Int] = a #:: apply(b, a + b)
}
