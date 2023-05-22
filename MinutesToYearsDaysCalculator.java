// The method should not return anything (void) and it needs to calculate the years and days from the minutes parameter.

public class MinutesToYearsDaysCalculator {
    
    public static void printYearsAndDays(long minutes) {
        if(minutes<0) {
            System.out.println("Invalid Value");
        } else {
            int days = (int) (minutes/(1440));
            int years = (int) (days/365);
            int daysRem = (int) (days%365);
            System.out.println(minutes + " min = " + years + " y and " + daysRem + " d" );
        }
    }
    
}