package homeWorkProblems;
import java.util.Scanner;

import patterns.patterns;

public class loops1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Even Numbers till " + n + " is ...");

        patterns p =  new patterns();
        prime primeObj = new prime();

        patterns patternObj = new patterns();

        for(int i=1 ; i<=n ; i++) {
            if(i%2==0) {
                System.out.println(i);
            }
        }
    }
}
