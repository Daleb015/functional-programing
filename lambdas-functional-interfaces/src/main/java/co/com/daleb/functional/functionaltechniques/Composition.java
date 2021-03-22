package co.com.daleb.functional.functionaltechniques;

public class Composition {


    public static void main(String[] args) {
        FunctionaCompositionInterface<Square, Integer> fun1 = s -> s.getArea();
        FunctionaCompositionInterface<Integer, Double> fun2 = area -> Math.sqrt(area);

        FunctionaCompositionInterface<Square, Double> composed = fun2.compose(fun1);

        Square s = new Square();
        s.setArea(100);

        Double side = composed.apply(s);

        System.out.println(side);

    }



}
