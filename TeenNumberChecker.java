// The method should return boolean and it needs to return true if one of the parameters is in range 13(inclusive) - 19 (inclusive). Otherwise return false.

public class TeenNumberChecker {
    
    public static boolean hasTeen(int num1, int num2, int num3) {
        if(isTeen(num1) || isTeen(num2) || isTeen(num3) ) {
            return true;
        }
        return false;
    }
    
    public static boolean isTeen(int num) {
        if(num>12 && num<20) {
            return true;
        }
        return false;
    }
    
}