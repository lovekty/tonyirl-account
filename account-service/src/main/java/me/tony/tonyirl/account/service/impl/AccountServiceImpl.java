package me.tony.tonyirl.account.service.impl;

import me.tony.tonyirl.account.orm.domain.AccountDO;
import me.tony.tonyirl.account.orm.mapper.AccountDOMapper;
import me.tony.tonyirl.account.service.AccountService;
import me.tony.tonyirl.account.service.dto.AccountDTO;
import org.springframework.beans.BeanUtils;
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
        AccountDO accountDO = accountDOMapper.selectByPrimaryKey(id);
        try {
            if (accountDO != null) {
                AccountDTO dto = new AccountDTO();
                BeanUtils.copyProperties(accountDO, dto);
                return dto;
            }
        } catch (Exception ignored) {

        }
        return null;
    }
}
