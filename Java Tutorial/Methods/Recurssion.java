package Methods;

public class Recurssion {
  //factorial(n) = n * n-1 * ...... * 1
  //factorial(5) = 5 * 4 * 3 * 2 * 1
  //factorial(n) = n * factorial(n-1);

  static int factorial(int n) {
    int result = 1;
    if(n==0 || n==1) {
      result = 1;
    } else if(n>=1) {
      result = n * factorial(n-1);
    }
    return result;
  }

  static int factorial_iterative(int n) {
    int product = 1;
    if(n==0 || n==1) {
      return 1;
    } else {
      for(int i=1; i<=n; i++) {
        product*=i;
      }
      return product;
    }
  }

  public static void main(String[] args) {
    int fact = factorial(5);
    System.out.println(fact);
    System.out.println(factorial_iterative(5));

  }
}
