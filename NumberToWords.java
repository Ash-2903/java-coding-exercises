// The method should print out the passed number using words for the digits.

public class NumberToWords {

    public static void numberToWords(int number) {
        
        if(number<0) {
            System.out.print("Invalid Value");
        }
        
        int revNum = reverse(number);
        int digNum = getDigitCount(number);
        
        while(revNum!=0) {

            for (int i = 0; i < digNum ; i++) {
                int lastDigit = revNum % 10;
                revNum = (int) revNum / 10;
                String msg = switch(lastDigit) {
                    case 1 -> "One ";
                    case 2 -> "Two ";
                    case 3 -> "Three ";
                    case 4 -> "Four ";
                    case 5 -> "Five ";
                    case 6 -> "Six ";
                    case 7 -> "Seven ";
                    case 8 -> "Eight ";
                    case 9 -> "Nine ";
                    case 0 -> "Zero ";
                    default -> "Invalid ";
                };
                System.out.print(msg);
            }
            
        }
         
    }
    
     public static int reverse (int number) {
        
        int num = number;
        int revNum = 0;
        while(num!=0) {
            int rem = num % 10;
            num = (int) num/10;
            revNum = revNum*10 + rem;
        }
        return revNum;
        
    }
    
    public static int getDigitCount (int number) {
        
        if(number<0) {
            return -1;
        }
        int count = 0;
        while(number != 0) {
            number = number/10;
            count++;
        }
        return count;
        
    }

}