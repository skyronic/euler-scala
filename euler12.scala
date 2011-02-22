object Euler12  {
    def main(args:Array[String])  {
        val result = (1 to Int.MaxValue).find(n => {

            // BRUTE FORCE AAAAARGH!!!
            val total = (n * (n + 1)) / 2;
            val totalDivisors = (1 to (total/2)).count(divisor => ((total % divisor) == 0)) + 1;
            //println ("For " + n + " the Divisors are - " + totalDivisors);
            (totalDivisors >= 500)
        });

        println (result);

        // to get the final result - do result * (result - 1) /2
    }
}

// vim: set ts=4 sw=4 et:
