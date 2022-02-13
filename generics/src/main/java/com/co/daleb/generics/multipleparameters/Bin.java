package com.co.daleb.generics.multipleparameters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bin<D, W> {

  private D drytrash;
  private W wetTrash;
}
