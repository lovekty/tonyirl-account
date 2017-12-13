package me.tony.tonyirl.passport.biz.impl;

import me.tony.tonyirl.account.service.model.Account;
import me.tony.tonyirl.passport.biz.AccountBiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author tony
 */
@Service
public class AccountBizImpl implements AccountBiz {

    @Autowired
    RestTemplate restTemplate;

    @Value("${account-provider}")
    private String name;

    @Override
    public Account getById(Long id) {
        return null;
    }
}
