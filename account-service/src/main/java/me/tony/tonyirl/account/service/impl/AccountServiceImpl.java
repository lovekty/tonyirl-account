package me.tony.tonyirl.account.service.impl;

import me.tony.base.util.BeanCopyUtils;
import me.tony.tonyirl.account.orm.mapper.AccountDOMapper;
import me.tony.tonyirl.account.service.AccountService;
import me.tony.tonyirl.account.service.dto.AccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by tony on 2017/3/9.
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
//        return AccountDTO.from(accountDOMapper.selectByPrimaryKey(id));
        return BeanCopyUtils.copySilence(accountDOMapper.selectByPrimaryKey(id), AccountDTO.class);
    }
}
