package spring;

import org.springframework.stereotype.Component;

@Component
public class NegativeNumberServiceImpl implements TestService {

    @Override
    public void printNumber() {
        System.out.println("-------------------------------------------------------------");
        System.out.println(-1);
        System.out.println("-------------------------------------------------------------");
    }
}
