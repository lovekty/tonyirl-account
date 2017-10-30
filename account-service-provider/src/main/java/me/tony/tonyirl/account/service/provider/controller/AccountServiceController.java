package me.tony.tonyirl.account.service.provider.controller;

import me.tony.tonyirl.account.service.AccountService;
import me.tony.tonyirl.account.service.dto.AccountDTO;
import me.tony.tonyirl.account.service.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * @author tony
 */
@RestController
@RequestMapping("/account")
public class AccountServiceController {

    private final AccountService accountService;

    @Autowired
    public AccountServiceController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/id/{id:\\d+}")
    public Account getById(@PathVariable("id") Long id) {
        AccountDTO dto = accountService.getById(id);
        return parse(dto);
    }

    @GetMapping("/key/{key}")
    public Account getByKey(@PathVariable("key") String key) {
        AccountDTO dto = accountService.getByKey(key);
        return parse(dto);
    }

    @GetMapping("/email/{email}")
    public Account getByEmail(@PathVariable("email") String email) {
        AccountDTO dto = accountService.getByEmail(email);
        return parse(dto);
    }

    @GetMapping("/mobile/{mobile}")
    public Account getByMobile(@PathVariable("mobile") String mobile) {
        AccountDTO dto = accountService.getByMobile(mobile);
        return parse(dto);
    }

    private Account parse(AccountDTO dto) {
        if (dto == null) {
            return null;
        }
        Account ret = new Account();
        copyProperties(dto, ret);
        return ret;
    }
}
