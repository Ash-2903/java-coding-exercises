// The method should return the greatest common divisor of the two numbers (int).

public class GreatestCommonDivisor {
    
    public static int getGreatestCommonDivisor(int first, int second) {  // 12 and 30
        if(first<10 || second<10) {
            return -1;
        }
        for(int i = first; i>=1 ; i--) {
            if(first%i==0) {
                for(int j = second; j>=1 ; j--) {
                    if(second%j==0) {
                        if (i==j) {
                            return i;
                        }
                    }
                }
            }
        }
        return 1;
    }
    
}