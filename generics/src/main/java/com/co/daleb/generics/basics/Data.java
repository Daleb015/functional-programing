package com.co.daleb.generics.basics;

class BaseData<T> {}

public class Data<T> extends BaseData<T> implements IData<T> {

  /*T is a type parameter*/

  private T data;

  @Override
  public T getData() {
    return data;
  }

  @Override
  public void setData(T data) {
    this.data = data;
  }

  public Data(T data) {
    this.data = data;
  }

  public String toString() {
    return "Data{" + "data='" + data + '\'' + '}';
  }
}
