package me.tony.tonyirl.account.serviceprovider.test;

import me.tony.tonyirl.account.service.provider.ProviderApp;
import me.tony.tonyirl.acount.jpa.entity.Account;
import me.tony.tonyirl.acount.jpa.repository.AccountRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderApp.class)
public class JpaTest {

    @Autowired
    private AccountRepository accountRepository;

    @Test
    public void testAccountRepository() {
        Account account = accountRepository.findByAccountKeyEquals("tonyirl");
        System.out.println(account);
    }
}
