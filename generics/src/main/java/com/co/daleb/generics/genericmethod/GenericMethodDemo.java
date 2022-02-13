package com.co.daleb.generics.genericmethod;

public class GenericMethodDemo {

  public static <T> String concat(T data) {
    return "Data is :" + data;
  }

  public static void main(String[] args) {
    System.out.println(concat("BasicStrong"));
    System.out.println(concat(43));
  }
}
