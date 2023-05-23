// The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
// printSquareStar(5); should print the following:

// *****            (5 stars)
// ** **            (2 stars space 2 stars)
// * * *            (1 star space 1 star space 1 star)
// ** **            (2 stars space 2 stars)
// *****            (5 stars)

// The patterns above consist of a number of rows and columns (where number is the number of rows to print). For each row or column, stars are printed based on four conditions
// * In the first or last row
// * In the first or last column
// * When the row number equals the column number
// * When the column number equals rowCount - currentRow + 1 (where currentRow is current row number)

public class DiagonalStar {
    
    public static void printSquareStar(int number) {
        
        if(number<5) {
            System.out.println("Invalid Value");
        } else {
            for(int i = 1; i <= number; i++ ) {
            
                for(int j = 1; j <= number; j++ ) {
                    
                    if(i==j || i==1 || j==1 || i==(number) || j==(number) || j==(number-i+1) ) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");         // 3 = 5-1+1   4 = 5-2+1
                    }
                    
                }
            System.out.println("");
            
            }
        }
        
        
    }
    
}