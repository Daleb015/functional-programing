package com.co.daleb.generics.wildcart;

public class DataNode<E> {
    private E data;
    private DataNode<E> next;

    public DataNode(E data, DataNode<E> next){
        this.data = data;
        this.next = next;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "DataNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }
}
