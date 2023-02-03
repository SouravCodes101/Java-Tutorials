package ErrorsAndException;

import java.util.Scanner;

public class Handling {
  public static void main(String[] args) {
    int [] marks = new int[5];
    marks[0] = 56;
    marks[1] = 7;
    marks[2] = 5;
    Scanner sc= new Scanner(System.in);

    System.out.println("Enter the array index: ");
    int ind = sc.nextInt();

    System.out.println("Enter the number you want to divide the value with: ");
    int number = sc.nextInt();

    try {
      System.out.println("Array index is: " + marks[ind]);
      System.out.println("array-value/number is: " + marks[ind]/number);
    } catch(ArithmeticException e) {
      System.out.println("ArithmeticException occured");
      System.out.println(e);
    } catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("ArrayIndexOutOfBoundsException occured");
      System.out.println(e);
    } 
  }
}
