package Recursion;

import homeWorkProblems.calculator;

// import java.util.*;

public class Recursion0 {
  public static void printNum(int n) {
    if (n == 6) {
      return;
    }
    System.out.println(n);
    printNum(n + 1);
  }

  static void sumOfN(int i, int n, int sum) {
    if (i == n) {
      sum += i;
      System.out.println(sum);
      return;
    }
    sum += i;
    sumOfN(i + 1, n, sum);
    System.out.println(i);
  }

  public static int fact(int n) {
    if(n==0||n==1) {
      return 1 ;
    }
    int factorial_nm1 = fact(n-1);
    int fact_n = n * factorial_nm1;
    return fact_n;
  }

  public static void printFibonacci(int a, int b, int n) {
    if(n==0) {
      return ;
    }
    int c = a + b;
    System.out.println(c);
    printFibonacci(b, c, n-1);
  }

  public static int calcPower(int x, int n) {
    if(n==0) {
      return 1;//Base case 1
    } 
    if(x == 0) {
      return 0;//Base case 2
    }
    int xPownm1 = calcPower(x, n-1);
    int xPow = x * xPownm1; 
    return xPow;
  }

  public static int calcPower1(int x, int n) {
    if(n==0) {
      return 1;//Base case 1
    } 
    if(x == 0) {
      return 0;//Base case 2
    }
    if(n%2==0) {
      return calcPower1(x, n/2) * calcPower1(x, n/2);
    } else {
      return calcPower1(x, n/2) * calcPower1(x, n/2) * x;
    }
  }


  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter a number");
    // int n = sc.nextInt();
    // sumOfN(1, n, 0);
    // int a =0,b=1;
    // System.out.println(a);
    // System.out.println(b);
    // int n = 7;
    // printFibonacci(a, b, n-2);

    int x = 2, n = 5;
    int ans = calcPower1(x, n);
    System.out.println(ans);
  }
}
