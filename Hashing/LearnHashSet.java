package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class LearnHashSet {
  public static void main(String[] args) {
    HashSet<String> countries = new HashSet<>();
    HashSet<String> copy = new HashSet<>();
    //Adding elements to hashset
    //using .add() method
    countries.add("India");
    countries.add("Spain");
    countries.add("Australia");
    countries.add("South Africa");

    //adding duplicates
    countries.add("India");

    //displaying HashSet
    System.out.println(countries);
    System.out.println("List contains India or Not: " + countries.contains("India"));
    System.out.println();
    copy = (HashSet)countries.clone();
    System.out.println("Countries copy: " + copy);
    System.out.println();
    //removing
    countries.remove("Australia");
    System.out.println("After removing Australia" + countries);

    System.out.println();
    //Iterating over HashSet
    Iterator<String> it = countries.iterator();
    
    while(it.hasNext()) {
      System.out.print(it.next() + " ");
    }

    System.out.println();

    for(String s: countries) {
      System.out.print(s+ " ");
    }
    
    System.out.println();
    System.out.println();

    countries.clear();
    System.out.println(countries);

    if(!countries.isEmpty()){
      System.out.println("HashSet is not empty");
    } else {
      System.out.println("HashSet is empty");
    }
  }
}
