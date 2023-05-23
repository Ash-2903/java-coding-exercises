// The method should not return anything (void) and it needs to keep reading int numbers from the keyboard.
// When the user enters something that is not an int then it needs to print a message in the format "SUM = XX AVG = YY".

import java.util.Scanner;
 
public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    
    public static void inputThenPrintSumAndAverage() {
        
        Scanner scanner = new Scanner (System.in);
        int sum = 0;
        long average = 0;
        int count = 0;
        
        while(true) {
            
            try {
                
                String numString = scanner.nextLine();
                int number = Integer.parseInt(numString);
                count++;
                sum+=number;
                average = (long) Math.round(sum/count) ;
            } catch (NumberFormatException e) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                scanner.close();
                break;
            }
            
        }
        
    }
}