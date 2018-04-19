package me.tony.tonyirl.account.jpa.test;

import me.tony.tonyirl.acount.jpa.entity.Account;
import me.tony.tonyirl.acount.jpa.repository.AccountRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountRepositoryTest {

    @Autowired(required = false)
    AccountRepository accountRepository;

//    @Before
//    public void before() {
//        ContextUtils.doNothing();
//    }

    @Test
    public void testFindBy() {
        Account account = accountRepository.findByAccountKeyEquals("tonyirl");
        System.out.println(account);
    }
}
