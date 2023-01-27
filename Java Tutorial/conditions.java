import java.util.*;

public class conditions {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        // int age = sc.nextInt();

        // if ( age > 18 ){
        //     System.out.println("You are an adult");
        // } else {
        //     System.out.println("You are not an adult");
        // }

        // int num = sc.nextInt();
        // if(num%2==0) {
        //     System.out.println("Even Number");
        // } else {
        //     System.out.println("Odd Number");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if ( a == b) {
        //     System.out.println("A == B");
        // } else if (a>b) {
        //     System.out.println("The first number i.e " + a + " is greater than second number , " + b);
        // } else {
        //     System.out.println("The second number i.e "  + b + " is greater than first number , " + a);
        // }

        int button = sc.nextInt();

        // if(button == 1) {
        //     System.out.println("Hello ");
        // } else if (button == 2) {
        //     System.out.println("Namaste");
        // } else if (button == 3) {
        //     System.out.println("Bonjour");
        // } else {
        //     System.out.println("Invalid Button");
        // }

        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Invalid Button");
                break;
        }
    }
}
