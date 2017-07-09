package me.tony.tonyirl.account.remote.test.provider;

import me.tony.tonyirl.account.api.dto.Account;
import me.tony.tonyirl.account.remote.provider.AccountApiProvider;
import me.tony.tonyirl.account.remote.test.BaseTest;
import org.apache.thrift.TException;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tony on 2017/3/10.
 */
public class AccountApiProviderTest extends BaseTest {

    @Autowired
    private AccountApiProvider provider;

    @Test
    public void testGetById() throws TException {
        Account account = provider.getById(1L);
        System.out.println(account);
    }
}
