package UsingArrays;

import java.util.Random;

import java.util.Arrays;

public class UsingArrays {
  public static void main(String[] args) {
    int[] firstArray = getRandomArray(10);
    System.out.println(Arrays.toString(firstArray));
    Arrays.sort(firstArray);
    System.out.println(Arrays.toString(firstArray));

    int[] secondArray = new int[10];
    System.out.println(Arrays.toString(secondArray));
    Arrays.fill(secondArray, 5);
    System.out.println(Arrays.toString(secondArray));

    int[] thirdArray = getRandomArray(10);
    System.out.println(Arrays.toString(thirdArray));
    
    int[] fourthArray = Arrays.copyOf(thirdArray,thirdArray.length );
    System.out.println(Arrays.toString(fourthArray));
  
    Arrays.sort(fourthArray);
    System.out.println(Arrays.toString(thirdArray));
    System.out.println(Arrays.toString(fourthArray));

    int[] smallArray = Arrays.copyOf(thirdArray,5);
    System.out.println(Arrays.toString(smallArray));

    int[] largeArray = Arrays.copyOf(thirdArray,15);
    System.out.println(Arrays.toString(largeArray));
  }

  private static int[] getRandomArray(int n) {
    Random random = new Random();
    int[] newInt = new int[n];
    for(int i=0; i<n; i++) {
      newInt[i] = random.nextInt(100);
    }
    return newInt;
  }
}
