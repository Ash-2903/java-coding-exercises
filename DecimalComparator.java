// The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.

public class DecimalComparator{
 
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int n1= (int) (num1*1000);
        int n2= (int) (num2*1000);
        if(n1==n2) {
            return true;
        }
        return false;
    }
 
}