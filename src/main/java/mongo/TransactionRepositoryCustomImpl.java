package mongo;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class TransactionRepositoryCustomImpl implements TransactionRepositoryCustom {

    @Autowired
    AccountRepository accountRepository;
    @Autowired
    MongoTemplate mongoTemplate;

    @Override
    public List<Transaction> findByAccountLogin(String login) {
        Query query = new Query();
        Account account = accountRepository.findByLogin(login);
        query.addCriteria(Criteria.where("account").is(new ObjectId(account.getId())));
        query.with(new Sort(Direction.ASC, "date"));
        List<Transaction> transactions = mongoTemplate.find(query, Transaction.class);
        transactions.forEach(transaction -> transaction.setSender(account));
        addRecipient(transactions);

        return transactions;
    }

    private void addRecipient(List<Transaction> transactions) {
        Map<String, Account> accountMap = new HashMap<>();
        for (Transaction transaction : transactions) {
            String recipientId = transaction.getAccount2();
            if (!accountMap.containsKey(recipientId)) {
                accountMap.put(recipientId, accountRepository.findByLogin(recipientId));
            }
        }
        transactions.forEach(transaction -> transaction.setRecipient(accountMap.get(transaction.getAccount2())));
    }
}
