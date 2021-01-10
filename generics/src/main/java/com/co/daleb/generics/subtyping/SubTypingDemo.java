package com.co.daleb.generics.subtyping;

import com.co.daleb.generics.raw.Box;

import java.util.ArrayList;
import java.util.List;

public class SubTypingDemo {

    public static void main(String[] args) {
        Object o = new Object();
        Integer i = Integer.valueOf(11);
        o = i;

        List<Number> list = new ArrayList<>();
        list.add(15);
        list.add(Integer.valueOf(15));
        list.add(Double.valueOf(15));

        List<Box<Integer>> bList = new ArrayList<>();
        bList.add(new Box<>(List.of(1,2,3)));
        bList.add(new SquareBox<>(List.of(3,7,6,9)));


    }

}
