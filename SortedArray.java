// Create a program using arrays that sorts a list of integers in descending order

import java.util.Scanner;
import java.util.Arrays;

public class SortedArray {

    public static void main(String[] args) {
        int[] theArray = getIntegers(5);
        printArray(sortIntegers(theArray));
    }
    
    public static int[] getIntegers( int size ) {
        int[] theArray = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<size ; i++) {
            int intNum = scanner.nextInt();
            theArray[i] = intNum;
        }
        scanner.close();
        return theArray;
    }
    
    public static void printArray( int[] theArray ) {
        for (int i =0; i<theArray.length; i++) {
            System.out.println("Element "+i+" contents "+theArray[i]);
        }
    }
    
    public static int[] sortIntegers( int[] theArray ) {
        Arrays.sort(theArray);
        int[] sortedArray = new int[theArray.length];
        for(int i=theArray.length; i>0; i--) {
            sortedArray[i-1] = theArray[theArray.length-i];
        }
        return sortedArray;
    }
    
    
    
    
    
    
    
    
    
}
