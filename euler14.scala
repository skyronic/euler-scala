object Euler14 {
    def main(args:Array[String])  {
        def lenOfCollatzChain (startNum: Int, total: Int):Int = {
            if(startNum == 1)
                return total;
            if(startNum % 2 == 0)
                return lenOfCollatzChain (startNum/2, total + 1);
            else
                return lenOfCollatzChain (startNum * 3 + 1, total + 1);
        };
        
        // this number will obviously be more than 700k. No need to start from 1
        println ((700000 until 1000000).map(x => lenOfCollatzChain(x, 1)).max);
    }
}

// vim: set ts=4 sw=4 et:
