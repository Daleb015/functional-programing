package com.co.daleb.generics.subtyping;

import com.co.daleb.generics.raw.Box;
import java.util.List;

public class SquareBox<T> extends Box<T> {

  public SquareBox(List<T> a) {
    super(a);
  }
}
