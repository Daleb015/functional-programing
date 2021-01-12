package com.co.daleb.generics.erasure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ErasureDemo {
    public static void main(String[] args) {

        //System.out.println(method1(10));

        ArrayList l1 = new ArrayList<String>();
        l1.add(12);
        l1.add(true);
        l1.add("Hello");
        System.out.println(l1);

    }

    public static String method1(Integer x) {
        List<String> a = new LinkedList<String>();
        List b = a;
        b.add(x);
        return a.iterator().next();
    }
}
