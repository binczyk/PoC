package stream;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = ExampleList.getList();
        List<Celebrity> celebrities = new ArrayList<>();

        celebrities.add(new Celebrity("Justin Bieber", true, false, true));
        celebrities.add(new Celebrity("Kim Kardashian", false, false, false));
        celebrities.add(new Celebrity("Joanna Krupa", true, true, false));

        print(celebrities, celebrity -> celebrity.canAct() == false);
        stringList.forEach(System.out::println);
        stringList.forEach(ExampleList::modify);
        stringList.forEach(string -> System.out.println(string));
        System.out.println("---------------------------");
        stringList.sort((String::compareTo));
        stringList.forEach(System.out::println);
        System.out.println("---------------------------");
        stringList.stream().filter(s -> s.contains("a")).forEach(System.out::println);
        List<String> startWithAnA = stringList.stream().filter(s -> s.contains("a")).collect(Collectors.toList());
        startWithAnA.forEach(System.out::println);
        System.out.println("---------------------------");
        stringList.stream().filter(s -> s.length() > 1 ).map(String::toLowerCase)
                  .sorted(Comparator.comparingInt(String::length)).forEach(System.out::println);
    }

    private static void print(List<Celebrity> celebrities, Predicate<Celebrity> checker) {// interfejs Predicate
        for (Celebrity celebrity : celebrities) {
            if (checker.test(celebrity)) {
                System.out.println(celebrity + " ");
            }
            System.out.println();
        }
    }

}
