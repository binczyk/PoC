package figure;

public class Triangle implements Figure {

    private final Double A_SIDE;
    private final Double B_SIDE;
    private final Double C_SIDE;

    public Triangle(Double a_side, Double b_side, Double c_side) throws TriangleCannotBeCreatedException {
        if (!canBeCreated(a_side, b_side, c_side)) {
            throw new TriangleCannotBeCreatedException();
        }
        A_SIDE = a_side;
        B_SIDE = b_side;
        C_SIDE = c_side;
    }

    private boolean canBeCreated(Double a_side, Double b_side, Double c_side) {
        boolean condition1 = a_side + b_side > c_side;
        boolean condition2 = a_side + c_side > b_side;
        boolean condition3 = b_side + c_side > a_side;
        return condition1 && condition2 && condition3;
    }

    @Override
    public Double area() {
        Double p = (this.A_SIDE + this.B_SIDE + this.C_SIDE) / 2;
        Double area2 = p * (p - this.A_SIDE) * (p - this.B_SIDE) * (p - this.C_SIDE);
        return Math.sqrt(area2);
    }

    @Override
    public Double circuit() {
        return A_SIDE + B_SIDE + C_SIDE;
    }
}
