package me.tony.tonyirl.account.remote.test.provider;

import me.tony.tonyirl.account.api.dto.Account;
import me.tony.tonyirl.account.remote.provider.AccountApiProvider;
import org.apache.thrift.TException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by tony on 2017/3/10.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AccountApiProviderTest {

    @Autowired
    private AccountApiProvider provider;

    @Test
    public void testGetById() throws TException {
        Account account = provider.getById(1L);
        System.out.println(account);
    }
}
