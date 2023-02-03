package Hashing;

import java.util.*;

public class LearnHashing {
  public static void main(String[] args) {
    //Key{type},value{type}
    HashMap<String,Integer> map = new HashMap<>();

    //Insertion
    map.put("India", 120);
    map.put("China", 150);
    map.put("US", 30);

    System.out.println(map);

    map.put("China", 180);
    System.out.println(map);

    //search
    if(map.containsKey("Malaysia")){
      System.out.println("Key is present in the map");
    } else {
      System.out.println("Key is not present in the map");
    }

    // System.out.println(map.get("China"));
    // System.out.println(map.get("Indonesia"));

    // int arr[] ={12,15,16};

    // for(int i=0 ; i<3; i++) {
    //   System.out.print(arr[i]+ " ");
    // }
    // System.out.println();

    // for(int val: arr) {
    //   System.out.print(val + " ");
    // }

    for(Map.Entry<String,Integer> e: map.entrySet()){
      System.out.println("key=" + e.getKey());
      System.out.println("value=" + e.getValue());
    }
    
    System.out.println();
    
    Set<String> keys = map.keySet();
    for(String key: keys) {
      System.out.println("Key=" + key + " " + " value=" + map.get(key));
    }
    System.out.println();
    
    map.remove("China");
    System.out.println(map);

  }
}
