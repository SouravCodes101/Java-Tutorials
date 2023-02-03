package Hashing;

import java.util.HashSet;

public class Set {
  public static void main(String[] args) {
    HashSet<Integer> myHashSet = new HashSet<>(5,0.5f);
    myHashSet.add(6);
    myHashSet.add(7);
    myHashSet.add(8);
    myHashSet.add(11);
    System.out.println(myHashSet);
  }
}
