object Euler16  {
    def main (args:Array[String])  {
        println(BigInt(2).pow(1000).toString.map(_.asDigit).sum)
    }
}

// vim: set ts=4 sw=4 et:
