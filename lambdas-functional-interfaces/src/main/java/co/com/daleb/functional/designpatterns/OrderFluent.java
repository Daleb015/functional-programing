package co.com.daleb.functional.designpatterns;

import java.util.ArrayList;
import java.util.List;

class OrderFluent {

  private List<String> cart = new ArrayList<>();
  private String address = "";

  public OrderFluent() {}

  public OrderFluent(List<String> cart, String address) {
    this.cart = cart;
    this.address = address;
  }

  public OrderFluent add(String item) {
    cart.add(item);
    System.out.println(item + "added to the cart");
    return new OrderFluent(this.cart, this.address);
  }

  public OrderFluent deliverAt(String location) {
    this.address = location;
    System.out.println("The delivery address set by you is " + location);
    return new OrderFluent(this.cart, this.address);
  }

  public OrderFluent place() {
    System.out.println("Order placed ");
    System.out.println(
      this.cart.size() +
      " items ordered by you will be delivered at " +
      this.address +
      " by tomorrow"
    );
    return new OrderFluent(this.cart, this.address);
  }
}
