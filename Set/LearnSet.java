package Set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class LearnSet {
  public static void main(String[] args) {
    Set<Student> studentSet = new HashSet<>();

    studentSet.add(new Student("Aman", 2));
    studentSet.add(new Student("John", 4));
    studentSet.add(new Student("Sourav", 3));
    studentSet.add(new Student("Chris", 2));

    System.out.println(studentSet);

    // Set<Integer> set = new HashSet<>();
    // Set<Integer> set = new LinkedHashSet<>();
    // Set<Integer> set = new TreeSet<>();
    // set.add(32);
    // set.add(54);
    // set.add(67);
    // set.add(45);
    // set.add(98);

    // System.out.println(set);
    // set.remove(32);
    // System.out.println(set);
    // System.out.println(set.contains(45));
    // System.out.println(set.isEmpty());
    // System.out.println(set.size());
    // set.clear();
    // System.out.println(set);

  }
}
