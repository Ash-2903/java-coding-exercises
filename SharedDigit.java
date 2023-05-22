// The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

public class SharedDigit {
    public static boolean hasSharedDigit( int num1,int num2 ){
        if( (num1<10||num1>99) || (num2<10||num2>99) ){
            return false;
        }
        int realNum2 = num2;
        while( num1>0 ){
            int num1Digit = num1%10;
            while( num2>0 ){
                int num2Digit = num2%10;
                if( num1Digit == num2Digit ){
                    return true;
                }
                num2 = num2/10;
            }
            num1 = num1/10;
            num2 = realNum2;
        }
        return false;
    }
}