// The method should return the sum of the even digits within the number. 

public class EvenDigitSum {
    
    public static int getEvenDigitSum (int number) {
        if(number<0) {
            return -1;
        }
        int sum = 0;
        int num = number;
        while(num!=0) {
            number = num%10; 
            if (number % 2 == 0) {
                sum+=number;
            }
            num = (int) num/10;
        }
        return sum;
    }
    
}
