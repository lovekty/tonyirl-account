package me.tony.tonyirl.account.service;

import me.tony.tonyirl.account.service.dto.AccountDTO;

/**
 * Created by tony on 2017/2/28.
 */
public interface AccountService {
    AccountDTO getById(Long id);
}
