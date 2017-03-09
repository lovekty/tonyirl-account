package me.tony.tonyirl.account.service.dto;

import me.tony.tonyirl.account.base.enums.EncryptTypeEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tony on 2017/3/9.
 */
public class PasswordHistoryRelationDTO implements Serializable {
    private static final long serialVersionUID = -5667078588978870459L;

    private Long accountId;

    private String accountPassword;

    private EncryptTypeEnum encryptType;

    private Date insertTime;

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountPassword() {
        return accountPassword;
    }

    public void setAccountPassword(String accountPassword) {
        this.accountPassword = accountPassword;
    }

    public EncryptTypeEnum getEncryptType() {
        return encryptType;
    }

    public void setEncryptType(EncryptTypeEnum encryptType) {
        this.encryptType = encryptType;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
}
