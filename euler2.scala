import Stream._

object Euler2
{
    def main(args: Array[String]) {
        lazy val fib: Stream[Int] = Stream.cons (0, Stream.cons(1, fib.zip (fib.tail).map( p => p._1 + p._2)))
        var result = fib.takeWhile (_ < 4000000).filter(_ % 2 == 0).sum
        println (result)
    }
}
// vim: set ts=4 sw=4 et:
