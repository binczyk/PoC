package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        Predicate<Integer> predicate = number -> number % 2 == 0;
        Predicate<Integer> predicate2 = number -> number > 5;
        Function<Integer, Integer> function = number -> number * 2;


        fillInts(ints);

        ints.stream().filter(predicate2).map(function).forEach(System.out::println);
    }

    private static void fillInts(List<Integer> ints) {
        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);
        ints.add(6);
        ints.add(7);
        ints.add(8);
        ints.add(9);
    }


}
