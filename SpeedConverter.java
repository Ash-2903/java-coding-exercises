// calculate the value of miles per hour, round it and return it
// 1 mile per hour is 1.609 kilometers per hour

public class SpeedConverter {
    
    public static long toMilesPerHour( double kilometersPerHour ) {
        if (kilometersPerHour<0) {
            return -1;
        } 
        long milesPerHour = Math.round((1/1.609)*kilometersPerHour);
        return milesPerHour;
        
    }
    
    public static void printConversion(double kilometersPerHour) {
        long conversionVal = toMilesPerHour(kilometersPerHour);
        if(conversionVal<0){
            System.out.println("Invalid Value");
        } else {
        System.out.println(kilometersPerHour + " km/h = " + conversionVal + " mi/h");
        }
    }
    
}
