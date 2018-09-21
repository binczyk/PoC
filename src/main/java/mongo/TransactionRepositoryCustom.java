package mongo;

import java.util.List;

public interface TransactionRepositoryCustom {

    List<Transaction> findByAccountLogin(String login);
}
