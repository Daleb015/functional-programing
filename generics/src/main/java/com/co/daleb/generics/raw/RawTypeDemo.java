package com.co.daleb.generics.raw;


import java.util.List;

public class RawTypeDemo {
    public static void main(String[] args) {

        Box<Integer> genBox = new Box<>(List.of(1, 2, 3));

        for (Integer integer : genBox.getA()
        ) {
            System.out.println(integer);
        }

        Box rawBox = new Box(List.of(1,2,"Basic strong"));

        for (Object objects: rawBox.getA()
             ) {
            System.out.println(objects);
        }

    }
}
