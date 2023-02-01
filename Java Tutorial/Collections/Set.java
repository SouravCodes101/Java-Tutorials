package Collections;

import java.util.HashSet;

public class Set {
  public static void main(String[] args) {
    HashSet<Integer> myHashSet = new HashSet<>(6,0.6f);
    myHashSet.add(7);
    myHashSet.add(10);
    myHashSet.add(88);
    myHashSet.add(99);
    System.out.println(myHashSet);
  }
}
