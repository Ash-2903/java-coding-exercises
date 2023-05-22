// We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
// In all other cases return false.

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if(barking && hourOfDay<8 && hourOfDay>=0) {
            return true;
        } else if(hourOfDay==23) {
            return true ;
            } else {
            return false;
        }
    }
}