object Euler6  {
    def main (args: Array[String])  {
        val numsum = (1 to 100).sum
        val numsqsum = (1 to 100).map (n => n * n).sum
        println (numsum * numsum - numsqsum)
    }
}

// vim: set ts=4 sw=4 et:
