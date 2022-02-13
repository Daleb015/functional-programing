package co.com.daleb.functional.PredefinedFunctionalInterfaces;

import com.sun.source.tree.LiteralTree;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PracticePredicate {

  public static void main(String[] args) {
    List<String> list = Arrays.asList("Daniel", " ", "Lineros", " ");

    Predicate<String> predicate = s -> !s.isBlank();

    List<String> noEmptyList = filterList(list, predicate);

    System.out.println(noEmptyList);

    Predicate<String> filter = s -> s.contains("Lineros");
    List<String> filtered = filterList(list, filter);

    System.out.println(filtered);

    List<Integer> intList = Arrays.asList(1, 4, 6, 7, 8);

    Predicate<Integer> integerFilter = e -> e % 2 == 0;

    List<Integer> filteredListInt = filterList(intList, integerFilter);
    System.out.println(filteredListInt);
  }

  public static <T> List<T> filterList(List<T> list, Predicate predicate) {
    List<T> newlist = new ArrayList<>();

    for (T t : list) {
      if (predicate.test(t)) {
        newlist.add(t);
      }
    }
    return newlist;
  }
}
