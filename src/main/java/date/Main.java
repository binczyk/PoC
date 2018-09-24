package date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class Main {

    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalDate.now().lengthOfYear());

        System.out.println(LocalTime.now());
        System.out.println(LocalTime.now().getNano());

        System.out.println(LocalDateTime.now());
        System.out.println(LocalDateTime.now().plusWeeks(46));

        System.out.println(ZonedDateTime.now());
        System.out.println(ZonedDateTime.now().getOffset());


    }

}
