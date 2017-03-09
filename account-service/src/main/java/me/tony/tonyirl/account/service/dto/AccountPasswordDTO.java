package me.tony.tonyirl.account.service.dto;

import me.tony.tonyirl.account.base.enums.EncryptTypeEnum;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by tony on 2017/3/9.
 */
public class AccountPasswordDTO implements Serializable {

    private static final long serialVersionUID = -6013661622117980259L;

    private Long id;

    private String accountPassword;

    private EncryptTypeEnum encryptType;

    private Date insertTime;

    private Date updateTime;

    private Boolean visible;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
