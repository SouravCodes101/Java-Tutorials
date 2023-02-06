package ErrorsAndException;

class NegativeRadiusException extends Exception {
  @Override
  public String toString() {
    return "Radius cannot be negative!!!";
  }

  @Override
  public String getMessage() {
    return "Radius cannot be negative!!!";
  }
} 

public class Throw_Throws {
  public static double area(int r) throws NegativeRadiusException{
    if(r<0) {
      throw new NegativeRadiusException();
    }
    double result = Math.PI * r * r;
    return result;
  }
  public static int divide (int a, int b) throws ArithmeticException{
    int result =  a/b;
    return result;
  }

  public static void main(String[] args) {
    try {
      int c = divide(6,5);
      System.out.println(c);
    }
    catch(Exception e) {
      System.out.println("Exception!!!");
    }

    try{
      int r = 6 ;
      double ar = area(r);
      System.out.println("Area of the circle with radius r = " + r + ",is " + ar);
    } catch(NegativeRadiusException e) {
      System.out.println(e);
    }
  }
}
