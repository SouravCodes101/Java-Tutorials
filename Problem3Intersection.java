import java.util.*;

public class Problem3Intersection {

  public static int intersection(int [] arr1, int [] arr2) {
    HashSet<Integer> set = new HashSet<>();
    int count=0;
    for(int i=0; i<arr1.length; i++) {
      set.add(arr1[i]);
    }
    System.out.println("Common elements in two arrays are:");
    for(int j=0; j<arr2.length; j++) {
      if(set.contains(arr2[j])){
        count ++;
        System.out.print(arr2[j] + " ");
        set.remove(arr2[j]);
      }
    }
    System.out.println();
    return count;
  }
  public static void main(String[] args) {
    int[] arr1 = {7,3,9};
    int[] arr2 = {6,3,9,2,9,4};
    System.out.println(intersection(arr1, arr2));
  }
}
