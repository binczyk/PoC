package optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> emptyOptional = Optional.empty();
        Optional<String> nullOptional;

        emptyOptional.ifPresent(System.out::println);
        //nullOptional.ifPresent(System.out::println);
        nullOptional = Optional.of("Dupa123");
        nullOptional.ifPresent(System.out::println);
        System.out.println(nullOptional.isPresent());
        System.out.println(nullOptional.orElse("inna dupa"));
        System.out.println("--------------------------------------------");
        nullOptional = Optional.ofNullable(null);
        System.out.println(nullOptional.isPresent());
        nullOptional.ifPresent(System.out::println);
        System.out.println(nullOptional.orElse("inna dupa"));
        nullOptional = Optional.ofNullable("dupa 123321");
        System.out.println(nullOptional.filter(s -> s.contains("321")).map(String::toUpperCase));
        System.out.println(nullOptional.filter(s -> s.contains("3213")).map(String::toUpperCase));
        nullOptional = Optional.empty();
        System.out.println(nullOptional.get());
    }
}
