package ErrorsAndException;

import java.util.Scanner;

public class NestedTryCatch {
  public static void main(String[] args) {
    int [] marks = new int[5];
    marks[0] = 56;
    marks[1] = 7;
    marks[2] = 5;
    Scanner sc = new Scanner(System.in);
    boolean flag=true;
    
    while(flag){
      System.out.println("Enter the index of the array to be found");
      int index=sc.nextInt();
    try {
      System.out.println("Welcome");
      try{
        System.out.println("Element is " + marks[index]);
        flag=false;
      }
      catch(ArrayIndexOutOfBoundsException e) {
          System.out.println("Sorry this index does not exist , ArrayIndexOutOfBoundsException Occured!!");
          System.out.println("Exception in level 2");
      }
    } 
    catch(Exception e) {
      System.out.println("Exception in level 1");
    }
  }
    System.out.println("Program ended!!");
  }
}
