// A perfect number is a positive integer which is equal to the sum of its proper positive divisors
// Proper positive divisors are positive integers that fully divide the perfect number without leaving a remainder and exclude the perfect number itself
// Write a method named isPerfectNumber with one parameter of type int named number.

public class PerfectNumber {
    
    public static boolean isPerfectNumber(int number) {
        
        if(number<1) {
            return false;
        }
        
        int sum =0;
        for (int i=1 ; i<number ; i++) {        // 6 -> 1 + 2 + 3
            if(number % i == 0) {
                sum+=i;
            }
        }
        if(sum==number) {
            return true;
        }
        return false;
        
    }
    
}