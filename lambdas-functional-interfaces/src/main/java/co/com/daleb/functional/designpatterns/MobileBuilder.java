package co.com.daleb.functional.designpatterns;

import co.com.daleb.functional.functionaltechniques.Consumer;

public class MobileBuilder {

  int ram, storage;
  int battery;
  int camera;
  String processor;
  double screenSize;

  public MobileBuilder with(Consumer<MobileBuilder> buildFields) {
    buildFields.accept(this);
    return this;
  }

  public Mobile createMobile() {
    return new Mobile(this);
  }
}
