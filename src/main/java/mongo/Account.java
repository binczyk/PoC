package mongo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@Document(collection = "accounts")
public class Account {

    @Id
    private String id;
    private String login;
    private String password;
    private String role;
    private Long limit;
}
