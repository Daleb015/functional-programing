package org.example;

import java.util.List;

public class ListDemo {

  public static void main(String[] args) {
    ListFun<Integer> list = ListFun.list(3, 6, 9);
    list.forEach(System.out::println);

    ListFun<Integer> addEle = list.addEle(56);
    addEle.forEach(System.out::println);

    ListFun<Integer> removeEle = addEle.removeEle(9);
    removeEle.forEach(System.out::println);

    ListFun<Integer> reverseList = removeEle.reverseList();
    reverseList.forEach(System.out::println);

    ListFun<Integer> list1 = ListFun.list(3, 6, 9, 8);
    ListFun<Integer> list2 = ListFun.list(37, 78, 90);

    ListFun.concat(list1, list2).forEach(System.out::println);

    List<Integer> l = List.of(2, 5, 8, 6);
    list1.addAllEle(l).forEach(System.out::println);
  }
}
