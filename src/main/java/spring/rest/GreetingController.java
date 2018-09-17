package spring.rest;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/daniel")
    public Greeting greeting() {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, "Daniel"));
    }

    @RequestMapping("/ktos")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public List<String> getTest(HttpServletResponse response) {
        List<String> stringList = new ArrayList<>();

        response.addHeader("count", "5");

        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());

        return stringList;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public List<String> postTest(HttpServletResponse response) {
        List<String> stringList = new ArrayList<>();

        response.addHeader("count", "2");
        response.addHeader("count", "22");
        response.addHeader("count", "2222");
        response.setHeader("cosinnego", "wartosc");
        response.setHeader("cosinnego", "dupa");

        stringList.add("aaaaaaaaaaaaaaaaaa");
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add(getRandmString());
        stringList.add("aaaaaaaaaaaaaaaaaaaaaaaaaaa");

        stringList.stream().map(String::toUpperCase).sorted(String::compareTo);
        return stringList;
    }

    private String getRandmString() {
        return RandomStringUtils.randomAlphanumeric(new Random().nextInt(10));
    }
}
