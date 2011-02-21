object Euler1 
{
    def main(args: Array[String]) {
        (1 until 1000).filter(n => n % 3 == 0 || n % 5 == 0).sum
    }
}


// vim: set ts=4 sw=4 et:
