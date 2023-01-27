package homeWorkProblems;

import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        boolean flag = false;
        System.out.println("Enter a number");
        int n = sc.nextInt();

        for (i=2; i<= n/2 ; i++) {
            if(n%i==0) {
                flag= true;
                break;
            }
        }

        if (!flag) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
