import java.util.Scanner;

public class MinMaxChallenge {
    
    public static void main(String[] args) {
        minMax();
    }

    public static void minMax() {

        System.out.println("Enter the numbers or enter a character to quit");
        Scanner scanner = new Scanner(System.in);
        double max = 0;
        double min = 0;
        int i =0;

        for(;;) {

            try {
                String numberString = scanner.nextLine();
                double number = Double.parseDouble(numberString);
                while(i!=1) {
                    max = number;  
                    min = number;
                    i=1;
                }
                if(number > max) {
                    max = number;
                }
                if(number < min) {     
                    min = number;
                }
            } catch (NumberFormatException e) {
                scanner.close();
                break;
            }

        }

        System.out.println("Max : " + max + " Min : " + min);

    }

}
