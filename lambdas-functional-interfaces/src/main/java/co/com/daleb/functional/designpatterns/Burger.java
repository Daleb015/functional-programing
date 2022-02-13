package co.com.daleb.functional.designpatterns;

public class Burger {

  private String burgerType;

  public Burger() {
    this.burgerType = "";
  }

  private Burger(String burgerType) {
    this.burgerType = burgerType;
  }

  public String getBurgerType() {
    return burgerType;
  }

  public void setBurgerType(String burgerType) {
    this.burgerType = burgerType;
  }

  public Burger addVegies() {
    System.out.println("Adding vegies to the burger");
    return new Burger(this.burgerType += " Vegie");
  }

  public Burger addCheese() {
    System.out.println("Adding cheese to the burguer");
    return new Burger(this.burgerType += " Cheese");
  }

  public String toString() {
    return String.format("%s", burgerType + " burger");
  }
}
