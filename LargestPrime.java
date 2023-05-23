// The method should calculate the largest prime factor of a given number and return it.

public class LargestPrime {

    public static void main(String[] args) {
        System.out.print(getLargestPrime(21));
    }
    
    public static int getLargestPrime(int number) {
        if(number<=1) {
            return -1;
        }
        for(int i = (number-1) ; i>1 ; i--) {            
            if(number%i==0) {
                number = i;
            }
        }
        return number;
    }
    
}