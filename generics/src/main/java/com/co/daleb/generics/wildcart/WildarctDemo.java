package com.co.daleb.generics.wildcart;

import java.util.ArrayList;
import java.util.List;

public class WildarctDemo {

  public static void displayData(List<? super Integer> l) {
    for (Object t : l) {
      System.out.println(t);
    }
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    List<Number> list1 = new ArrayList<>();
    list.add(34);
    list.add(57);
    displayData(list1);
  }
}
