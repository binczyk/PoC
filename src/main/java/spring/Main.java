package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Qualifier("positiveNumberServiceImpl")
    @Autowired
    private TestService positiveService;

    @Qualifier("negativeNumberServiceImpl")
    @Autowired
    private TestService negativeService;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        positiveService.printNumber();
        negativeService.printNumber();
    }
}
