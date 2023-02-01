package ArrayProject;

import java.util.*;

public class MinElementChallenge {
  public static void main(String[] args) {
    int[] returnedArray = readIntegers();
    System.out.println(Arrays.toString(returnedArray));

    // int returnedMin = findMin(returnedArray);
    // System.out.println("min = " + returnedMin);

    // reverseArray(returnedArray);
    // System.out.println("Final:" + Arrays.toString(returnedArray));

    int[] reversedCopy = reverseCopy(returnedArray);
    System.out.println("After reverse " + Arrays.toString(returnedArray));
    System.out.println("Reverse Copy" + Arrays.toString(reversedCopy));

  }

  private static int[] readIntegers() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a list of numbers, seperated by comas:");
    String input =  scanner.nextLine(); 
    
    String[] splits = input.split(",");
    int[] values = new int[splits.length];
    for(int i=0; i<splits.length; i++) {
      values[i] = Integer.parseInt(splits[i].trim());
    }
    return values;
  }

  private static int findMin(int[] array){
    int min = Integer.MAX_VALUE;
    for(int element: array) {
      if(element<min) {
        min = element;
      }
    }
    return min;
  }

  private static int[] reverseArray(int[] array){
    int maxIndex = array.length - 1;
    int halfIndex = array.length/2;

    int temp;
    for(int i=0; i<halfIndex;i++) {
      temp = array[i];
      array[i] = array[maxIndex-i];
      array[maxIndex-i] = temp; 
      System.out.println("-->" + Arrays.toString(array));
    }
    return array;
  }

  public static int[] reverseCopy(int[] array) {
    int[] reverseArray = new int[array.length];
    int maxIndex = array.length-1;
    for(int el: array) {
      reverseArray[maxIndex--] = el;
    }
    return reverseArray;
  }
}
