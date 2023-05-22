// The method should use a for loop to sum all odd numbers in that range including the end and return the sum
// It should call the method isOdd to check if each number is odd.

public class SumOddRange {
 
    public static boolean isOdd( int num ) {
        if(num<0) {
            return false;
        }
        if(num%2!=0) {
            return true;
        }
        return false;
    }
    
    public static int sumOdd( int start, int end ) {
        
        if (start<0 || end<0 || start>end) {
            return -1;
        }
        int sum =0;
        for (int i = start; i <= end ; i++) {
            if (isOdd(i)) {
                sum = sum + i;
            }
        }
        return sum;
        
    }
 
}