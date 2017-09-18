package me.tony.tonyirl.account.remote.provider;

import me.tony.tonyirl.account.api.AccountApi;
import me.tony.tonyirl.account.api.dto.Account;
import me.tony.tonyirl.account.api.dto.AuthenticationResult;
import me.tony.tonyirl.account.api.enums.AccountStatus;
import me.tony.tonyirl.account.service.AccountService;
import me.tony.tonyirl.account.service.dto.AccountDTO;
import org.apache.thrift.TException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by tony on 2017/3/9.
 */
@Component
public class AccountApiProvider implements AccountApi.Iface {

    private final AccountService accountService;

    @Autowired
    public AccountApiProvider(AccountService accountService) {
        this.accountService = accountService;
    }

    private static Account from(AccountDTO dto) {
        if (dto == null) {
            return null;
        }
        Account account = new Account();
        account.setId(dto.getId())
                .setAccountKey(dto.getAccountKey())
                .setEmail(dto.getEmail())
                .setMobile(dto.getMobile())
                .setAccountStatus(Enum.valueOf(AccountStatus.class, dto.getAccountStatus().name()))
                .setNickname(dto.getNickname());
        return null;
    }

    private static List<Account> from(List<AccountDTO> dtos) {
        if (dtos == null || dtos.isEmpty()) {
            return Collections.emptyList();
        }
        List<Account> rst = new ArrayList<>(dtos.size());
        for (AccountDTO dto : dtos) {
            Account account = from(dto);
            if (account != null) {
                rst.add(account);
            }
        }
        return rst;
    }

    @Override
    public Account getById(long id) throws TException {
        AccountDTO dto = accountService.getById(id);
        return from(dto);
    }

    @Override
    public Account getByKey(String key) throws TException {
        return null;
    }

    @Override
    public Account getByEmail(String email) throws TException {
        return null;
    }

    @Override
    public Account getByMobile(String mobile) throws TException {
        return null;
    }

    @Override
    public AuthenticationResult authenticate(String principal, String credential) throws TException {
        return null;
    }
}
