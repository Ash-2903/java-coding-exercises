// The method should return true if at least two of the numbers share the same rightmost digit; otherwise, it should return false.

public class LastDigitChecker {
    
    public static boolean hasSameLastDigit( int num1, int num2, int num3 ) {
        if( !isValid(num1) || !isValid(num2) || !isValid(num3) ) {
            return false;
        }
        int lastDigit1 = num1%10;
        int lastDigit2 = num2%10;
        int lastDigit3 = num3%10;
        if ( lastDigit1==lastDigit2 || lastDigit2==lastDigit3 || lastDigit3==lastDigit1 ) {
            return true;
        }
        return false;
    }
    
    public static boolean isValid ( int num ) {
        if(num<10 || num>1000) {
            return false;
        }
        return true;
    }
    
}