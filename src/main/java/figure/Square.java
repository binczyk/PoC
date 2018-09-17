package figure;

public class Square implements Figure {

    private final Double A_SIDE;
    private final Double B_SIDE;

    public Square(Double a_side, Double b_side) {
        A_SIDE = a_side;
        B_SIDE = b_side;
    }

    @Override
    public Double area() {
        return A_SIDE * B_SIDE;
    }

    @Override
    public Double circuit() {
        return 2 * A_SIDE + 2 * B_SIDE;
    }
}
