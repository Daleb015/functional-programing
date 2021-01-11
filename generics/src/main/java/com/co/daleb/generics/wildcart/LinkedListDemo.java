package com.co.daleb.generics.wildcart;

public class LinkedListDemo {
    public static void main(String[] args) {

        DataNode<Integer> node2 = new DataNode<Integer>(20,null);
        DataNode<Integer> node1 = new DataNode<Integer>(35,node2);



        System.out.println(node1.toString());

    }
}
