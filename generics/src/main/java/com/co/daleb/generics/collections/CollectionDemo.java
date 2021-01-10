package com.co.daleb.generics.collections;

import java.util.ArrayList;

public class CollectionDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add(
                "Jhon"
        );
        // list.add(1);

        for (String object: list
             ) {
            String str = object;

            System.out.println(str);
        }

    }
}
