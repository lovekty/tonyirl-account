package me.tony.tonyirl.account.service.dto;


import me.tony.tonyirl.account.base.enums.AccountStatusEnum;

import java.io.Serializable;

/**
 * Created by tony on 2017/3/9.
 */
public class AccountDTO implements Serializable {
    private static final long serialVersionUID = -1731605013210090389L;

    private String accountKey;

    private String email;

    private String mobile;

    private String nickname;

    private AccountStatusEnum accountStatus;
}
