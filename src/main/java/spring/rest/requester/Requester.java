package spring.rest.requester;

import org.apache.commons.lang.StringUtils;
import org.springframework.web.client.RestTemplate;
import spring.rest.service.Greeting;

import java.util.Optional;

public class Requester {

    private static RestTemplate restTemplate = new RestTemplate();
    private static StringBuilder resourceURL;
    private static final String BASE_URL = "http://localhost:8080/greeting/ktos";

    public static Greeting getGreetings() {
        return getGreetings(Optional.empty());
    }

    public static Greeting getGreetings(Optional<String> name) {
        resourceURL = new StringBuilder(BASE_URL);
        name.filter(StringUtils::isNotEmpty).ifPresent(string -> resourceURL.append("?name=").append(string));
        Greeting response = restTemplate.getForObject(resourceURL.toString(), Greeting.class);
        return response;
    }
}
