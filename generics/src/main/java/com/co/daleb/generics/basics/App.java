package com.co.daleb.generics.basics;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    Data<String> d1 = new Data<>("This is d1");

    System.out.println(d1.toString());

    Data<Integer> d2 = new Data<>(10);

    int data = (int) d2.getData();

    System.out.println(data);

    IData<Long> d3 = new Data<>(15L);

    System.out.println(d3.toString());

    /*generic Type: generic class or generic interface*/

    // Subclassing

    Data<String> d4 = new Data<>("Data 4");

    BaseData<String> b1 = d4;
  }
}
