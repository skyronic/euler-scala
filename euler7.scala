object Euler7 {
    def main(args: Array[String])  {
        // Prime number sieve
        lazy val ps:Stream[Int] = 2 #:: ps.map (i => Stream.from(i + 1).find(j => ps.takeWhile (k => k * k <= j).forall (l => j % l > 0)).get)

        // Since 2 = index 0, we are looking for 10000th index
        println (ps(10000))
    }
}

// vim: set ts=4 sw=4 et:
