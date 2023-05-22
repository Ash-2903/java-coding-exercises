// The method should return true if the number is a palindrome number otherwise it should return false. 

public class NumberPalindrome {
    
    public static boolean isPalindrome (int number) {
        
        int num = number;
        int revNum = 0;
        while(num!=0) {
            int rem = num % 10;
            num = (int) num/10;
            revNum = revNum*10 + rem;
        }
        if(number == revNum) {
            return true;
        }
        return false;
        
    }
 
}