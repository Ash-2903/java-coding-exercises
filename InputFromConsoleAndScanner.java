import java.util.Scanner;

public class InputFromConsoleAndScanner {
    public static void main(String[] args) {
        
        int currentYear = 2022;
        // System.out.println(getInputFromConsole(currentYear));
         System.out.println(getInputFromScanner(currentYear));

        // try {
        //     System.out.println(getInputFromConsole(currentYear));
        // } catch (Exception e) {
        //     System.out.println(getInputFromScanner(currentYear));
        // }
        
    }

    public static String getInputFromConsole( int currentYear ) {

        String name = System.console().readLine("Hi , whats your name ? ");
        System.out.println("Hi " + name + ", have a good day !" );

        String dob = System.console().readLine("What's your year of birth ? ");
    
        return (name + ", you are " + (currentYear- Integer.parseInt(dob)) + " years old." );

    }

    public static String getInputFromScanner( int currentYear ) {

        Scanner scanner = new Scanner ( System.in );

        System.out.println("Hi , whats ur name ?");
        String name = scanner.nextLine();
        System.out.println("Hi " + name + ", have a good day !");

        int age = 0;

        do {

            System.out.println("What's your year of birth ? Range -> between " + (currentYear-125) + " - " + currentYear);

            try {
                age = checkData(currentYear, scanner.nextLine());
            } catch (NumberFormatException badUserData) {
                System.out.println("Characters Not allowed . Try again .");
            }

        } while(age==-1);
        
        scanner.close();
        return name + ", you are " + (age) + " years old. ";

    }

    public static int checkData(int currentYear, String dateOfBirth) {
        int numDob = Integer.parseInt(dateOfBirth);
        int minYear = currentYear - 125;

        if ((numDob<minYear || numDob>currentYear)) {
            return -1;
        }

        return (currentYear-numDob);
    }
}
