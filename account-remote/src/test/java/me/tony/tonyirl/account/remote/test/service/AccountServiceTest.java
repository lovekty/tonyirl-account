package me.tony.tonyirl.account.remote.test.service;

import me.tony.tonyirl.account.remote.test.BaseTest;
import me.tony.tonyirl.account.service.AccountService;
import me.tony.tonyirl.account.service.dto.AccountDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by tony on 2017/7/9.
 */
public class AccountServiceTest extends BaseTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void test() {
        AccountDTO accountDTO = accountService.getById(1L);
        System.out.println(accountDTO == null);
    }
}
