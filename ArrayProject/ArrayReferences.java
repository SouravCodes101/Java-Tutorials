package ArrayProject;

import java.util.*;

public class ArrayReferences {
  public static void main(String[] args) {
    int[] myIntArray = new int[5];
    int[] anotherArray = myIntArray;

    System.out.println(Arrays.toString(myIntArray));
    System.out.println(Arrays.toString(anotherArray));

    anotherArray[0] = 1;
    System.out.println("After change myIntArray = " + Arrays.toString(myIntArray));
    System.out.println("After change anotherArray = " + Arrays.toString(anotherArray));

    modifyArray(myIntArray);
    System.out.println("" + Arrays.toString(myIntArray));
    System.out.println("" + Arrays.toString(anotherArray));
  }

  private static void modifyArray(int[] array) {
    array[1] = 2;
  }
}
