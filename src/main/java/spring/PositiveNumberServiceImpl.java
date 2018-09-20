package spring;

import org.springframework.stereotype.Component;

@Component
public class PositiveNumberServiceImpl implements TestService {

    @Override
    public void printNumber() {
        System.out.println("-------------------------------------------------------------");
        System.out.println(1);
        System.out.println("-------------------------------------------------------------");
    }
}
