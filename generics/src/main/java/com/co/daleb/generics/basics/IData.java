package com.co.daleb.generics.basics;

interface IBase<T> {}

public interface IData<T> extends IBase<T> {
  public T getData();

  public void setData(T data);
}
