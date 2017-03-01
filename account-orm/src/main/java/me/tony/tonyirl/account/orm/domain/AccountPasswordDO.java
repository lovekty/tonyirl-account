package me.tony.tonyirl.account.orm.domain;

import java.io.Serializable;
import me.tony.base.orm.BaseEntity;
import me.tony.tonyirl.account.orm.enums.EncryptTypeEnum;

public class AccountPasswordDO extends BaseEntity implements Serializable {
    private String accountPassword;

    private EncryptTypeEnum encryptType;

    private static final long serialVersionUID = 1L;

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
        AccountPasswordDO other = (AccountPasswordDO) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountPassword() == null ? other.getAccountPassword() == null : this.getAccountPassword().equals(other.getAccountPassword()))
            && (this.getEncryptType() == null ? other.getEncryptType() == null : this.getEncryptType().equals(other.getEncryptType()))
            && (this.getInsertTime() == null ? other.getInsertTime() == null : this.getInsertTime().equals(other.getInsertTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getVisible() == null ? other.getVisible() == null : this.getVisible().equals(other.getVisible()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountPassword() == null) ? 0 : getAccountPassword().hashCode());
        result = prime * result + ((getEncryptType() == null) ? 0 : getEncryptType().hashCode());
        result = prime * result + ((getInsertTime() == null) ? 0 : getInsertTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getVisible() == null) ? 0 : getVisible().hashCode());
        return result;
    }
}