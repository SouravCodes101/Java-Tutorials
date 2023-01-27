package Arrays;
import java.io.OutputStream;
import java.util.*;

public class TwoDArrays {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the Number of Rows");
       int rows = sc.nextInt();
       System.out.println("Enter the Number of Columns");
       int cols = sc.nextInt();
       int[][] numbers = new int [rows][cols];

        System.out.println("Enter the Elements of the array");
       //* Input */
       for( int i=0; i<rows; i++ ) {
        //*Columns */    
        for ( int j=0; j<cols; j++ ) {
            numbers[i][j] = sc.nextInt();
            }
       }

       System.out.println("Enter the element to be searched");
       int x = sc.nextInt();

       //* Search */
       for( int i=0; i<rows ; i++ ) {
        //*Compare with x */
        for( int j=0; j<cols ; j++ ) {
            if( numbers[i][j] == x ) {
                System.out.println("X found at location, ( " + i + " , " + j +")");
            } 
        }
       }
    }
}
