package ArrayChallenge;

import java.util.*;

public class ArrayChallenge {
  public static void main(String[] args) {
    int[] unSortedArray = getRandom(5);
    System.out.println(Arrays.toString(unSortedArray));

    int[] sortedArray =  sortIntegers(new int[] {5,12,45});
    System.out.println(Arrays.toString(sortedArray));
  }

  private static int[] getRandom(int len) {
    Random random = new Random();
    int[] randomArray = new int[len];
    
    for(int i=0; i<len;i++) {
      randomArray[i] = random.nextInt(100);
    }
    return randomArray;
  }

  public static int[] sortIntegers(int[] array) {
    System.out.println(Arrays.toString(array));
    int[] sortedArray = Arrays.copyOf(array,array.length);
    boolean flag = true;
    int temp;
    while(flag) { 
      flag=false;
      for(int i=0; i<sortedArray.length-1; i++) {
        if(sortedArray[i]<sortedArray[i+1]) {
          temp = sortedArray[i];
          sortedArray[i] = sortedArray[i+1];
          sortedArray[i+1] = temp;
          flag=true;
          System.out.println("--->" + Arrays.toString(sortedArray));
          }
        }
        System.out.println("-->" + Arrays.toString(sortedArray));
    }
    return sortedArray;    
  }
}
