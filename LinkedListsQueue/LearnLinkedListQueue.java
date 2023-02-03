package LinkedListsQueue;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
  public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();

    queue.offer(12);
    queue.offer(24);
    queue.offer(36);
    queue.offer(64);
    queue.offer(128);

    System.out.println(queue);

    System.out.println("poll: " + queue.poll());

    System.out.println(queue);

    System.out.println("Peek: " + queue.peek());
  }
}
