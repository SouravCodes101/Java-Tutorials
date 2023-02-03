package ErrorsAndException;

public class Try {
  public static void main(String[] args) {
    
    int a=900;
    int b=0;
    //todo Without Try
    // !int c=a/b;
    // !System.out.println("The result is " + c);

    //todo With Try
    try{
      int c=a/b;
      System.out.println("The result is " + c);
    } catch(Exception e) {
      System.out.print("We failed to divide. Reason: ");
      System.out.println(e);
    }
    System.out.println("End Of the program");
  }
}
