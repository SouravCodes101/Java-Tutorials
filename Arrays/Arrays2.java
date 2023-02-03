package Arrays;

public class Arrays2 {
    public static void main(String[] args) {
        // float marks[] = {97.5f,73.2f,91.6f,87.3f,78.4f};
        // System.out.println(students.length);
        // System.out.println(marks[0]);
        // String [] students = {"Tony", "Stark", "Sourav"};
        int marks[] = {97,73,91,87,78};
        for(int i=0; i<marks.length; i++ ) {
            System.out.println(marks[i]);
        }
        for(int i=marks.length-1; i>=0; i-- ) {
            System.out.println(marks[i]);
        }
        System.out.println("Printing the elements of an array using for each loop");
        for ( int element:marks ) {
            System.out.println(element);
        }
    }
}
