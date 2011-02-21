object Euler5
{
    def main(args: Array[String]) {
        // Naive implementation:
        // use find() instead of filter() as we're only interested in first value
        //val naive = (20 until Int.MaxValue).find(i => (2 until 20).forall( i % _ == 0)).get
        //println(naive)
        

        // non naive. Any non prime number below 20 can be composed of factors.
        // hence, to get the product of all factors - just multiply all primes 
        // from 2 to 20

        // prime number sieve
        //lazy val ps:Stream[Int] = 2 #:: ps.map (i => Stream.from(i + 1).find(j => ps.takeWhile (k => k * k <= j).forall (l => j % l > 0)).get)

        //val res = ps.takeWhile (_ < 20).view.product

        // Edit. This is wrong - if number is divisble by 2 & 5 - it doesn't mean it's divisible by 20.


    }
}

// vim: set ts=4 sw=4 et:
