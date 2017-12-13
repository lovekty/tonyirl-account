package me.tony.tonyirl.passport.feign;

import me.tony.tonyirl.account.service.model.Account;
import me.tony.tonyirl.passport.feign.fallback.AccountFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotNull;

/**
 * @author tony
 */
@FeignClient(name = "tonyirl-account-service-provider", fallback = AccountFallback.class)
public interface AccountFeignClient {

    @RequestMapping("/account/id/{id:\\d+}")
    Account getAccountById(@NotNull Long id);

}
