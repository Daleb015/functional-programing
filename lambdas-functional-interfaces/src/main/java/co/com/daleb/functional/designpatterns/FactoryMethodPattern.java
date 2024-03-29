package co.com.daleb.functional.designpatterns;

public class FactoryMethodPattern {

  public static void main(String[] args) {
    Flooring floor = FlooringFactory.getFlooring(-1, 18);
    floor.installation();

    Flooring floor2 = FlooringFactory.getFlooring(13, 46);
    floor2.installation();
  }
}
