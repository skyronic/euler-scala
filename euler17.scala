object Euler17  {
    def main(args:Array[String])  {
        def digitToName (digit:Int):String = digit match {
            case 1 => "one"
            case 2 => "two"
            case 3 => "three"
            case 4 => "four"
            case 5 => "five"
            case 6 => "six"
            case 7 => "seven"
            case 8 => "eight"
            case 9 => "nine"
            case _ => "unknown"
        }
        def numToName (input:Int):Int = {
            var name = new StringBuilder();
            if(input >= 100)  {
                name.append(digitToName(input / 100) + "hundred")
                if(input % 100 != 0)
                    name.append("and");
            }
            val hundreds = input % 100;
            if (hundreds >= 20)  {
                val tens = (hundreds / 10);
                val tensString = (tens match {
                    case 2 => "twenty"
                    case 3 => "thirty"
                    case 4 => "forty"
                    case 5 => "fifty"
                    case 6 => "sixty"
                    case 7 => "seventy"
                    case 8 => "eighty"
                    case 9 => "ninety"
                    case 0 => ""
                })
                name.append (tensString);
                if(hundreds % 10 != 0) { 
                name.append( digitToName (hundreds % 10));
            }
            } else if (hundreds >= 10)  {
                val teens = (hundreds % 10);
                name.append (teens match {
                    case 1 => "eleven"
                    case 2 => "twelve"
                    case 3 => "thirteen"
                    case 4 => "fourteen"
                    case 5 => "fifteen"
                    case 6 => "sixteen"
                    case 7 => "seventeen"
                    case 8 => "eighteen"
                    case 9 => "nineteen"
                    case 0 => "ten"
                });
            } else if (hundreds > 0) {
                name.append(digitToName (hundreds % 10))
            }

            name.length
        }

        println((1 to 999).map(x => numToName (x)).sum + "onethousand".length);
    }
}

// vim: set ts=4 sw=4 et:
