object Euler4
{
    def main(args: Array[String]) {
        // Very naive implementation.
        (100 to 999).foreach(i => (i to 999).filter (j => (i * j).toString == (i * j).toString.reverse).foreach(j => println (i * j)))
    }
}

// vim: set ts=4 sw=4 et:
