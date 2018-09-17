package figure;

public class TriangleCannotBeCreatedException extends Exception {

    public TriangleCannotBeCreatedException() {
        super("Triangle can not be created. Remember: a+b >c\n" + "a+c >b\n" + "b+c >a");
    }
}
