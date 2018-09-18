package spring.rest.requester;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        System.out.println(Requester.getGreetings().toString());
        System.out.println(Requester.getGreetings(Optional.of("Daniel")).toString());
        System.out.println(Requester.getGreetings(Optional.of("")).toString());
    }
}
