package com.co.daleb.generics.raw;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Box<T> {

    private List<T> a;

}
