package ArrayLists;

import java.util.*;

public class ArrayLists {
  public static void main(String[] args) {
    ArrayList<Integer> list1 = new ArrayList<>();

    list1.add(7);
    list1.add(9);
    list1.add(3);
    list1.add(2);
    list1.add(6);
    System.out.println(list1);

    // get elements
    int element = list1.get(0);
    System.out.println(element);
    // add element in between
    list1.add(1, 1);
    System.out.println(list1);

    // set element
    list1.set(0, 5);
    System.out.println(list1);

    // delete element
    list1.remove(3);
    System.out.println(list1); 

    //size
    int size = list1.size();
    System.out.println(list1);

    //loops
    for(int i=0; i<list1.size(); i++) {
      System.out.print(list1.get(i));
    }
    System.out.println();

    //Sorting
    Collections.sort(list1);
    System.out.println(list1);
  }
}
