package QuestionsAfterExceptionHandling;

import java.util.Scanner;

class InvalidIndexException extends Exception {
  @Override
  public String toString() {
    // TODO Auto-generated method stub
    return "Invalid Index !!!";
  }
  @Override
  public String getMessage() {
    // TODO Auto-generated method stub
    return "Invalid Index!!";
  }
}

public class ProblemOne {

  public static void index() throws InvalidIndexException {
    boolean flag = true;
    int marks[] = new int[3];
    marks[0] = 55;
    marks[1] = 78;
    marks[2] = 97;
    int index;
    int i = 0;
    Scanner sc = new Scanner(System.in);
    while(flag && i<5) {
     try{
      System.out.println("Enter the value of index");
       index = sc.nextInt();
       System.out.println("The value of marks[index] is " + marks[index]);
       break;
     }
     catch(Exception e) {
       System.out.println("Invalid Index");
       i ++;
     }
     if(i>=5) {
      throw new InvalidIndexException();
     }
    }
  }
  public static void main(String[] args) {
    //Problem 1
    //!Syntax error -  int a = 7
    int age= 78;
    int year_born = 2000-78; // Logical Error
    // System.out.println(6/0); // Exception

    //Problem 2
    try {
      int a = 666/0;
    }
    catch(IllegalArgumentException e){
      System.out.println("Hehe");
    } 
    catch(ArithmeticException e) {
      System.out.println("Haha");
    }

    //Problem 3
    try {
      index();
    } 
    catch (InvalidIndexException e) {
      System.out.println(e.getMessage());
    }
  }
}
