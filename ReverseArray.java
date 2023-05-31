// Write a method called reverse() with an int array as a parameter.
// The method should not return any value. In other words, the method is allowed to modify the array parameter.

import java.util.*;

public class ReverseArray {
    
    private static void reverse( int[] array ) {
        
        System.out.println("Array = " + Arrays.toString(array));
        
        int halfRange = array.length/2;
        
        for(int i=0; i<halfRange; i++) {
            int temp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = temp;
        }
        
        System.out.println("Reversed array = " + Arrays.toString(array));
        
        
    }
    
}