// The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit of that number.

public class FirstLastDigitSum {
    
    public static int sumFirstAndLastDigit( int number ) {
        
        if(number<0) 
            return -1;
        int fDigit = number;
        while(fDigit >= 10) {
            fDigit = (int) fDigit/10;
        }
        int lDigit = number % 10;
        int sum = fDigit + lDigit;
        return sum;
        
    }
    
}