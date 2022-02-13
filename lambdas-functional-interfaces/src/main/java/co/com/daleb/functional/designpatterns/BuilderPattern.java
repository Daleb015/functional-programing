package co.com.daleb.functional.designpatterns;

public class BuilderPattern {

  public static void main(String[] args) {
    MobileBuilder mobileBuilder = new MobileBuilder();
    final Mobile mobile = mobileBuilder
      .with(myBuilder -> {
        myBuilder.ram = 4;
        myBuilder.battery = 4000;
        myBuilder.processor = "A12 Bionic";
      })
      .createMobile();

    System.out.println(mobile);
  }
}
