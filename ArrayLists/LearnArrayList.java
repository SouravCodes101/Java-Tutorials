package ArrayLists;

import java.util.*;

public class LearnArrayList {
  public static void main(String[] args) {
    // ArrayList<Integer> List = new ArrayList<>();
    // List.add(1);
    // List.add(2);
    // List.add(3);
    // System.out.println(List);

    // List.add(4);
    // System.out.println(List);
    
    // List.add(1,50);
    // System.out.println(List);

    // List<Integer> newList = new ArrayList<>();
    // newList.add(150);
    // newList.add(980);
    // List.addAll(newList);
    // System.out.println(List);

    // System.out.println(List.get(1));

    ArrayList<Integer> newList = new ArrayList<>();
    newList.add(10);
    newList.add(20);
    newList.add(30);
    newList.add(40);
    newList.add(50);
    newList.add(60);

    System.out.println(newList);

    for(int i=0; i<newList.size(); i++) {
      System.out.println("The element is = " + newList.get(i));
    }

    for(Integer element: newList) {
      System.out.println("ForEach element is " + element);
    }

    Iterator<Integer> it = newList.iterator();
    while(it.hasNext()) {
      System.out.println("iterator " + it.next());
    }
    // newList.set(2,1000);
    // System.out.println(newList);

    // System.out.println(newList.contains(500));

    // System.out.println(newList);
    // newList.remove(1);
    // System.out.println(newList);
    // newList.remove(Integer.valueOf(30));
    // System.out.println(newList);
    // newList.clear();
    // System.out.println(newList);

    // ArrayList<Integer> al = new ArrayList<>();

    // for(int i=0; i<=5 ; i++) {
    //   al.add(i);
    // }
    // System.out.println(al);
    // al.remove(3);

    // for(int i=0; i<al.size(); i++) {
    //   System.out.print(al.get(i) + " ");
    // }
  }
}
