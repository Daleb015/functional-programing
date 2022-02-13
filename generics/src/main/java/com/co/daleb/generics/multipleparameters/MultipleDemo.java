package com.co.daleb.generics.multipleparameters;

import java.util.HashMap;

public class MultipleDemo {

  public static void main(String[] args) {
    HashMap<Integer, String> map = new HashMap<>();
    Bin<String, Integer> bin = new Bin<>();
    bin.setDrytrash("Caneca");
    bin.setWetTrash(1990);
    System.out.println(bin.getDrytrash());
    System.out.println(bin.getWetTrash());
  }
}
