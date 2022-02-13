package com.co.daleb.generics.raw;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Box<T> {

  private List<T> a;
}
