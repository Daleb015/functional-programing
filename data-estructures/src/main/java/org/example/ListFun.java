package org.example;

import java.util.Collection;
import java.util.function.Consumer;

public abstract class ListFun<T> {

    public abstract T head();

    public abstract ListFun<T> tail();

    public abstract boolean isEmpty();

    public static final ListFun NIL = new Nil();

    private static class Nil<T> extends ListFun<T>{

        private Nil(){

        }

        @Override
        public T head() {
            return null;
        }

        @Override
        public ListFun<T> tail() {
            return null;
        }

        @Override
        public boolean isEmpty() {
            return true;
        }
    }

    public int length(){
        int l = 0;

        ListFun<T> temp = this;

        while (!temp.equals(NIL)){
            l++;
            temp = temp.tail();
        }

        return l;
    }

    private static class Const<T> extends ListFun<T>{

        private final T head;
        private final ListFun<T> tail;

        Const(T element, ListFun<T> list){
            this.head=element;
            this.tail=list;
        }

        @Override
        public T head() {
            return head;
        }

        @Override
        public ListFun<T> tail() {
            return tail;
        }

        @Override
        public boolean isEmpty() {
            return length() == 0 ? true : false;
        }
    }

    public static <T> ListFun<T> list(){
        return NIL;
    }

    public static <T> ListFun<T> list(T... t){
        ListFun<T> temp = list();
        for (int i = t.length - 1; i >= 0; i--) {
            temp = new Const<T>(t[i],temp);
        }
        return temp;
    }

    public ListFun<T> addEle(T e){
        return new Const<T>(e,this);
    }

    public void forEach(Consumer<? super T> action){
        T current = this.head();
        ListFun<T> temp = this;

        for (int i = 0; i < length(); i++) {
            action.accept(current);
            temp = temp.tail();
            current = temp.head();
        }
    }

    public ListFun<T> removeEle(T e){
        if (this.length() == 0)
            return this;
        else if (e.equals(this.head()))
            return tail();
        else{
            ListFun<T> newTail = tail().removeEle(e);
            if (newTail.equals(tail()))
                return this;
            return new Const<T>(head(),newTail);
        }
    }

    public ListFun<T> reverseList(){

        ListFun<T> list = list();
        T current = this.head();
        ListFun<T> temp = this;

        while (!temp.equals(NIL)){
            list = list.addEle(current);
            temp = temp.tail();
            current = temp.head();
        }

        return list;
    }

    public static <T> ListFun<T> concat(ListFun<T> list1, ListFun<T> list2){
        return list1.isEmpty()?list2:new Const<T>(list1.head(),concat(list1.tail(),list2));
    }

    public ListFun<T> addAllEle(final Collection<? extends T> list){
        ListFun<T> result = this;
        for (T t:list) {
            result = result.addEle(t);
        }
        return result;
    }

}
