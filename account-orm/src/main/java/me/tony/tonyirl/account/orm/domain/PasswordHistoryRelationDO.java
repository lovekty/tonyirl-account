package me.tony.tonyirl.account.orm.domain;

import java.io.Serializable;
import me.tony.base.orm.BaseRelation;
import me.tony.tonyirl.account.base.enums.EncryptTypeEnum;

public class PasswordHistoryRelationDO extends BaseRelation implements Serializable {
    private Long accountId;

    private String accountPassword;

    private EncryptTypeEnum encryptType;

    private static final long serialVersionUID = 1L;

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

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        PasswordHistoryRelationDO other = (PasswordHistoryRelationDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getAccountPassword() == null ? other.getAccountPassword() == null : this.getAccountPassword().equals(other.getAccountPassword()))
            && (this.getEncryptType() == null ? other.getEncryptType() == null : this.getEncryptType().equals(other.getEncryptType()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getAccountPassword() == null) ? 0 : getAccountPassword().hashCode());
        result = prime * result + ((getEncryptType() == null) ? 0 : getEncryptType().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        return result;
    }
}