package figure;

public class Circle implements Figure {

    private final Double R;

    public Circle(Double r) {
        R = r;
    }

    @Override
    public Double area() {
        return 2 * Math.PI * Math.pow(this.R, 2);
    }

    @Override
    public Double circuit() {
        return 2 * Math.PI * this.R;
    }
}
