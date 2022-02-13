package com.co.daleb.generics.boundedtypeparameter;

import java.util.Arrays;
import java.util.List;

public class BoundedT {

  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(new Integer[] { 2, 5, 8, 9 });
    List<String> sList = Arrays.asList(new String[] { "hello", "There", "Basicstrng" });

    List<Double> dList = Arrays.asList(new Double[] { 2.3, 2.8, 2.9, 3.7 });

    DataSorter<Integer> sorter1 = new DataSorter<>(list);
    //DataSorter<String> sorter2 = new DataSorter<>(sList);
    sorter1.getSortedData();
    //sorter2.getSortedData();
    DataSorter<Double> sorter3 = new DataSorter<>(dList);
    sorter3.getSortedData();

    //getSortedData(list);
    CBound b = new CBound();
    getSortedData(b);
  }

  public static <T extends IBound1 & IBound2> void getSortedData(T list) {
    /*list.sort(null);
        for (T t : list) {
            System.out.println(t);
        }*/
  }
}

interface IBound1 {}

interface IBound2 {}

class CBound implements IBound1, IBound2 {}
