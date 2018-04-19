package me.tony.tonyirl.acount.jpa.entity;

import lombok.Data;
import me.tony.tonyirl.account.base.enums.AccountStatusEnum;
import me.tony.tonyirl.acount.jpa.converter.AccountStatusEnumConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@Entity
@Table(name = "e_account",
        indexes = {
                @Index(columnList = "account_key", unique = true),
                @Index(columnList = "email", unique = true),
                @Index(columnList = "mobile", unique = true)
        })
public class Account implements Serializable {
    private static final long serialVersionUID = 7768608304549505442L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "account_key", nullable = false, length = 64)
    private String key;
    @Column(nullable = false, length = 64)
    private String email;
    @Column(nullable = false, length = 32)
    private String mobile;
    @Column(nullable = false, length = 16)
    private String nickname;
    @Column(name = "account_status", nullable = false, length = 16)
    @Convert(converter = AccountStatusEnumConverter.class)
    private AccountStatusEnum status;
    @Column(name = "insert_time", nullable = false)
    @GeneratedValue
    private Date insertTime;
    @Column(name = "update_time", nullable = false)
    @GeneratedValue
    private Date updateTime;
    @Column(name = "is_visible", nullable = false)
    private Boolean visible;


}
