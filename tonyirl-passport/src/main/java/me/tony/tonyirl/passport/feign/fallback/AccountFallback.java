package me.tony.tonyirl.passport.feign.fallback;

import me.tony.tonyirl.account.service.model.Account;
import me.tony.tonyirl.passport.feign.AccountFeignClient;
import org.springframework.stereotype.Service;

/**
 * @author tony
 */
@Service
public class AccountFallback implements AccountFeignClient {
    @Override
    public Account getAccountById(Long id) {
        return null;
    }
}
