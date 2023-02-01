package ArrayProject;

import java.util.*;

public class MinElement {
  public static void main(String[] args) {
    int[] readArray = readIntegers();
    System.out.println(Arrays.toString(readArray));
    int min = findMin(readArray);
    System.out.println(min);
  }
  private static int[] readIntegers() {
    Scanner sc = new Scanner(System.in);
    int[] array = new int[10];
    System.out.println("Enter 10 elements ");
    for(int i=0; i<array.length; i++) {
      array[i] = sc.nextInt();
    }
    return array;
  }

  private static int findMin(int[] array) {
    int min;
    int[] minArray = array;
    min = minArray[0];
    for(int i=0; i<minArray.length; i++) {
      if(minArray[i]<min) {
        min = minArray[i];
      }
    }
    return min;
  }
}
