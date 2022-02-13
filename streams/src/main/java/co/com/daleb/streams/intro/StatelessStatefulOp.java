package co.com.daleb.streams.intro;

import java.util.List;
import java.util.stream.Collectors;

public class StatelessStatefulOp {

  public static void main(String[] args) {
    List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

    // this is a bad use of parallel because skip and limit are statefull operations
    List<Integer> collect = list.parallelStream().skip(2).limit(5).collect(Collectors.toList());
  }
}
