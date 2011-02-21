object Euler10  {
    def main(args:Array[String])  {
        // prime number sieve
        lazy val ps:Stream[Int] = 2 #:: ps.map (i => Stream.from(i + 1).find(j => ps.takeWhile (k => k * k <= j).forall (l => j % l > 0)).get)

        // sum all primes below 2 million
        //println(ps.takeWhile(_ < 2000000).sum); // this won't work as sum only works with int.
        println (ps.takeWhile (j => j < 2000000).foldLeft (0L)(_ + _))

    }
}

// vim: set ts=4 sw=4 et:
