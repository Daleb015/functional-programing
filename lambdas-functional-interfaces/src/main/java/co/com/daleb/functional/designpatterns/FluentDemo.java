package co.com.daleb.functional.designpatterns;

public class FluentDemo {
    public static void main(String[] args) {

        // no fluent version
        Order myOder = new Order();
        myOder.add("Shoes");
        myOder.add("Headphones");
        myOder.deliverAt("Cll Siempre viva 123");
        myOder.place();

        // Fluent Version
        new OrderFluent()
                .add("shoes")
                .add("headphones")
                .deliverAt("Cll siempre viva 123")
                .place();

        // Fluent version functional
        OrderFluentFunctional.place(orderFluentFunctional ->
                        orderFluentFunctional.add("Shoes")
                            .add("Headphones")
                            .deliverAt("Cll 123 av siempre viva")
                );


    }
}
