package me.tony.tonyirl.account.service.dto;


import me.tony.tonyirl.account.base.enums.AccountStatusEnum;
import me.tony.tonyirl.account.orm.domain.AccountDO;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tony on 2017/3/9.
 */
public class AccountDTO implements Serializable {
    private static final long serialVersionUID = -1731605013210090389L;

    private Long id;

    private String accountKey;

    private String email;

    private String mobile;

    private String nickname;

    private AccountStatusEnum accountStatus;

    private Date insertTime;

    private Date updateTime;

    private Boolean visible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountKey() {
        return accountKey;
    }

    public void setAccountKey(String accountKey) {
        this.accountKey = accountKey;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public AccountStatusEnum getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(AccountStatusEnum accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }
}
