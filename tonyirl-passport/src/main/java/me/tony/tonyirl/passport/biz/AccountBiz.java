package me.tony.tonyirl.passport.biz;

import me.tony.tonyirl.account.service.model.Account;

import javax.validation.constraints.NotNull;

/**
 * @author tony
 */
public interface AccountBiz {

    Account getById(@NotNull Long id);
}
