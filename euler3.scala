object Euler
{
    def main(args: Array[String]) {
        lazy val ps:Stream[Int] = 2 #:: ps.map (i => Stream.from(i + 1).find(j => ps.takeWhile (k => k * k <= j).forall (l => j % l > 0)).get)

        val n = 600851475143L;
        val result = ps.takeWhile(_ < 775146).filter(n % _ == 0).last
        println (result)
    }
}

// vim: set ts=4 sw=4 et:
