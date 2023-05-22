// java 17

public class PositiveNegativeorZero {

    public static void main(String[] args) {
        checkNumber(291);
    }
    
    public static void checkNumber( int num ) {

        if (num>0) {
            System.out.println("positive");  
        } else if (num<0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
      
    } 

}
