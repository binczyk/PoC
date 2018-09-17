package spring.rest.requester;

import org.springframework.web.client.RestTemplate;
import spring.rest.service.Greeting;

public class Requester {

    private static RestTemplate restTemplate = new RestTemplate();
    private static StringBuilder resourceURL = new StringBuilder("http://localhost:8080/greeting/ktos");

    public static Greeting getGreetings() {
        Greeting response = restTemplate.getForObject(resourceURL.toString(), Greeting.class);
        return response;
    }

    public static Greeting getGreetings(String name) {
        resourceURL.append("?name=");
        resourceURL.append(name);
        Greeting response = restTemplate.getForObject(resourceURL.toString(), Greeting.class);
        return response;
    }
}
