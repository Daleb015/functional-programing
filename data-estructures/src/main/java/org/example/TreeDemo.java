package org.example;

public class TreeDemo {

  public static void main(String[] args) {
    TreeFun<Integer> t = TreeFun.tree(23, 5, 76, 10, 3, 45);
    TreeFun<Integer> tree = t.remove(10);
    System.out.println(tree);

    System.out.println(tree.isMember(45));

    System.out.println(tree.max());
  }
}
