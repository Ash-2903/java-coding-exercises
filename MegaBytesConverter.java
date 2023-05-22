// The method should not return anything (void) and it needs to calculate the megabytes and remaining kilobytes from the kilobytes parameter.

public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        
        if (kiloBytes<0) {
            System.out.println("Invalid Value");
        }
        else {
            int mbVal = (int) kiloBytes/1024;
            int remKb = (kiloBytes) % 1024;
            System.out.println(kiloBytes+" KB = " + mbVal + " MB and " + remKb + " KB");
        }
    }
 
}