package Collections;

import java.util.ArrayDeque;

public class Dequee {
  public static void main(String[] args) {
    ArrayDeque<Integer> aq = new ArrayDeque<>();
    aq.add(4);
    aq.add(43);
    aq.add(7);
    aq.addFirst(5);
    System.out.println(aq.getFirst());
    System.out.println(aq.getLast());

    for(int i=0; i<aq.size(); i++ ) {
      System.out.println(aq.pollFirst());
    }
  }
}
