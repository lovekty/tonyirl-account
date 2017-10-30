package me.tony.tonyirl.account.service;

import me.tony.tonyirl.account.service.dto.AccountDTO;

/**
 * Created by tony on 2017/2/28.
 */
public interface AccountService {
    AccountDTO getById(Long id);

    AccountDTO getByKey(String key);

    AccountDTO getByEmail(String email);

    AccountDTO getByMobile(String mobile);
}
