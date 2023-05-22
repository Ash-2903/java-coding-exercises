//  calculate if the year is a leap year and return true if it is, otherwise return false. 
// The method - getDaysInMonth, needs to return the number of days in the month. Be careful about leap years, they have 29 days in month 2 (February).

public class NumberOfDaysInMonth {
   
    public static boolean isLeapYear (int year) {
        if (year>=1 && year<=9999) {
            if ((year % 4 == 0 )) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        return true;
                    } 
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
   
   public static int getDaysInMonth( int month, int year ) {
       
       if (month<1 || month>12 || year<1 || year >9999 ) {
           return -1;
       }
       if(isLeapYear(year) && month == 2 ) {
           return 29;
       }
       switch(month) {
           case 11:
           case 4 :
           case 6:
           case 9 :
             return 30;
           case 2 :
               return 28;
           default :
                return 31;
       }
       
   }
   
}