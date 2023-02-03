package ArrayDequess;

import java.util.ArrayDeque;

public class LearnArrayDeque {
  public static void main(String[] args) {
    ArrayDeque<Integer> adq = new ArrayDeque<>();
    
    adq.offer(12);
    adq.offer(24);
    adq.offerFirst(36);
    adq.offerLast(64);
    adq.offer(54);

    System.out.println(adq);
    System.out.println("peek: " + adq.peek());
    System.out.println("peekFirst: " +adq.peekFirst());
    System.out.println("peekLast: " +adq.peekLast());

    System.out.println("poll: " +adq.poll());
    System.out.println("pollFirst: " +adq.pollFirst());
    System.out.println("pollFirst()" + adq);
    System.out.println("pollLast: " +adq.pollLast());
    System.out.println("pollLast()" + adq);
  }
}
