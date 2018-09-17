package figure;

public class Calculator {

    public static void main(String[] args) {
        ResultPrinter.print(new Circle(23D));
        ResultPrinter.print(new Square(12D, 21D));
        try {
            ResultPrinter.print(new Triangle(18D, 12D, 25D));
        } catch (TriangleCannotBeCreatedException e) {
            System.out.println("Triangle: Wrong data!");
        }
    }
}
