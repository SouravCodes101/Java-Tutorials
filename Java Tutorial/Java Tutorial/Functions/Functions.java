package Functions;
import java.util.*;

public class Functions {
    public static void printMyName(String name){
        System.out.println(name);
        return ;
    }

    // public static int sumTwoNum(int a, int b) {
    //     int sum = a+b;
    //     return sum;
    // }

    // public static int printProduct(int a, int b) {
    //     int product = a*b;
    //     return product;
    // }

    public static void printFactorial(int num) {
        if(num<0) {
            System.out.println("Invalid Number");
            return;
        }
        int factorial = 1;

        for(int i = num ; i>=1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // int a = sc.nextInt();
        // int b= sc.nextInt();

        // int sum = sumTwoNum(a, b);
        // System.out.println("Sum of two numbers is: " + sum);
        // printMyName(name);// function call

        // int product = printProduct(a, b);
        // System.out.println("Product of two numbers is"+ product);

        int n = sc.nextInt();
        printFactorial(n);
    }
}
