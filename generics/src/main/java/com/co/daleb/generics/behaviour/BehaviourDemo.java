package com.co.daleb.generics.behaviour;

import java.util.ArrayList;

public class BehaviourDemo {
    public static void main(String[] args) {
        ArrayList<String> l = new ArrayList<>();
        l.add("Basics");
        l.add("Strong");
        method(l);
        System.out.println(l);
    }

    public static void method(ArrayList l) {
        l.add(10);
        l.add("See this");
        l.add(true);
    }
}
