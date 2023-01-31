package Arrays;
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        // int [] marks = new int[3];
        // int marks[] = new int[3];

        // marks[0] = 97;
        // marks[1] = 91;
        // marks[2] = 88;

        // int marks[] = {97,91,88};

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // for (int i = 0; i<3 ; i++) {
        //     System.out.println(marks[i]);
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array");
        int size = sc.nextInt();
        int numbers[]= new int[size];

        System.out.println("Enter the elemnts of  the array");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for(int i =0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.println(x + " found at index "+ i);
            }
        }

    }
}
