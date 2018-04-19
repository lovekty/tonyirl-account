package me.tony.tonyirl.acount.jpa.repository;

import me.tony.tonyirl.acount.jpa.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByAccountKeyEquals(String accountKey);

    Account findByEmailEquals(String email);

    Account findByMobileEquals(String mobile);
}
