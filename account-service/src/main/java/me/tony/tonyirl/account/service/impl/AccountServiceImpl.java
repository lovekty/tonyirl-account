package me.tony.tonyirl.account.service.impl;

import me.tony.tonyirl.account.orm.domain.AccountDO;
import me.tony.tonyirl.account.orm.domain.AccountDOExample;
import me.tony.tonyirl.account.orm.mapper.AccountDOMapper;
import me.tony.tonyirl.account.service.AccountService;
import me.tony.tonyirl.account.service.dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.springframework.beans.BeanUtils.copyProperties;

/**
 * @author tony
 * @date 2017/3/9
 */
@Service
public class AccountServiceImpl implements AccountService {

    private final AccountDOMapper accountDOMapper;

    @Autowired
    public AccountServiceImpl(AccountDOMapper accountDOMapper) {
        this.accountDOMapper = accountDOMapper;
    }

    @Override
    public AccountDTO getById(Long id) {
        AccountDO account = accountDOMapper.selectByPrimaryKey(id);
        return parse(account);
    }

    @Override
    public AccountDTO getByKey(String key) {
        AccountDOExample example = new AccountDOExample();
        example.createCriteria().andAccountKeyEqualTo(key).andVisibleEqualTo(true);
        List<AccountDO> accounts = accountDOMapper.selectByExample(example);
        if (accounts.isEmpty()) {
            return null;
        }
        return parse(accounts.get(0));
    }

    @Override
    public AccountDTO getByEmail(String email) {
        AccountDOExample example = new AccountDOExample();
        example.createCriteria().andEmailEqualTo(email).andVisibleEqualTo(true);
        List<AccountDO> accounts = accountDOMapper.selectByExample(example);
        if (accounts.isEmpty()) {
            return null;
        }
        return parse(accounts.get(0));
    }

    @Override
    public AccountDTO getByMobile(String mobile) {
        AccountDOExample example = new AccountDOExample();
        example.createCriteria().andMobileEqualTo(mobile).andVisibleEqualTo(true);
        List<AccountDO> accounts = accountDOMapper.selectByExample(example);
        if (accounts.isEmpty()) {
            return null;
        }
        return parse(accounts.get(0));
    }

    private AccountDTO parse(AccountDO account) {
        if (account != null && account.getVisible()) {
            AccountDTO dto = new AccountDTO();
            copyProperties(account, dto);
            return dto;
        }
        return null;
    }
}
