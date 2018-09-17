package figure;

public class ResultPrinter {

    public static void print(Figure figure) {
        System.out.println("Figura: " + figure.getClass().getName());
        System.out.println("Pole: " + figure.area());
        System.out.println("Obwód: " + figure.circuit());
    }
}
