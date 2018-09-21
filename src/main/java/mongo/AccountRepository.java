package mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface AccountRepository extends MongoRepository<Account, String> {

    Account findByLogin(String login);

    List<Account> findByRoleOrderByLoginDesc(String role);
}
