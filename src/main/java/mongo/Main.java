package mongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Account account = accountRepository.findByLogin("daniel");
        System.out.println(account.toString());

        accountRepository.findByRoleOrderByLoginDesc("employee").forEach(System.out::println);

        transactionRepository.findByAccountLoginOrderByDate("bob").forEach(System.out::println);
    }
}
