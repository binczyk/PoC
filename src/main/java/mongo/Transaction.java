package mongo;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;
    private String account;
    private String account2;
    private Account sender;
    private Account recipient;
    private LocalDateTime date;
    private Long amount;
    private Long after;
    private String title;
}
