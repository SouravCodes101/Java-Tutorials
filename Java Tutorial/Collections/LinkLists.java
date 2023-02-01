package Collections;

import java.util.*;

public class LinkLists {
  public static void main(String[] args) {
    LinkedList<Integer> l1 = new LinkedList<>();
    LinkedList<Integer> l2 = new LinkedList<>();

    l2.add(11);
    l2.add(15);
    l2.add(17);
    l2.add(12);
    l2.add(18);

    l1.add(4);
    l1.add(7);
    l1.add(2);
    l1.add(9);
    l1.add(7);
    l1.add(0,9);
    l1.add(0,8);
    l1.addAll(l2);
    l1.addFirst(987);
    l1.addLast(876);
    // l1.clear();
    System.out.print(l1.contains(7));
    System.out.print(" Index is " +l1.indexOf(7));
    System.out.println(" Index is " +l1.lastIndexOf(7));

    l1.set(1,566);

    for(int i=0; i<l1.size(); i++) {
      System.out.print(l1.get(i));
      System.out.print(" ,");
    }

    System.out.println(l1.clone());
    System.out.println(l1.subList(2,7));  
  }
}
