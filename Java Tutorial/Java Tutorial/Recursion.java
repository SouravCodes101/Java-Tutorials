import java.util.*;

public class Recursion {
  public static void printNumb(int n) {
    if(n ==0) {
      return ;
    } 
    System.out.println(n);
    printNumb(n-1);
  }
  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printNumb(n);
  }
}
