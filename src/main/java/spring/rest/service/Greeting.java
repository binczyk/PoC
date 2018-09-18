package spring.rest.service;


import lombok.*;

@Getter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Greeting {

    private long id;
    private String name;

}