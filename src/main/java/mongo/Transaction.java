package mongo;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "transactions")
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Transaction {

    @Id
    private String id;
    @DBRef
    private Account account;
    @DBRef
    private Account account2;
    private LocalDateTime date;
    private Long amount;
    private Long after;
    private String title;
}
