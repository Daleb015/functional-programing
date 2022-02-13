package org.example;

public class MapDemo {

  public static void main(String[] args) {
    MapFun<Integer, String> map = new MapFun<>(5);
    map.put(1, "Nikhil");
    map.put(2, "Saurabh");
    map.put(3, "Alex");
    map.put(4, "Shawn");
    map.put(5, "Justin");

    map.display();
  }
}
