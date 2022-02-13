package co.com.daleb.functional.designpatterns;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class OrderFluentFunctional {

  private List<String> cart = new ArrayList<>();
  private String address = "";

  public OrderFluentFunctional() {}

  public OrderFluentFunctional(List<String> cart, String address) {
    this.cart = cart;
    this.address = address;
  }

  public OrderFluentFunctional add(String item) {
    cart.add(item);
    System.out.println(item + "added to the cart");
    return new OrderFluentFunctional(this.cart, this.address);
  }

  public OrderFluentFunctional deliverAt(String location) {
    this.address = location;
    System.out.println("The delivery address set by you is " + location);
    return new OrderFluentFunctional(this.cart, this.address);
  }

  public static void place(Function<OrderFluentFunctional, OrderFluentFunctional> function) {
    OrderFluentFunctional orderFluentFunctional = new OrderFluentFunctional();
    orderFluentFunctional = function.apply(orderFluentFunctional);
    System.out.println("Order placed ");
    System.out.println(
      orderFluentFunctional.cart.size() +
      " items ordered by you will be delivered at " +
      orderFluentFunctional.address +
      " by tomorrow"
    );
  }
}
