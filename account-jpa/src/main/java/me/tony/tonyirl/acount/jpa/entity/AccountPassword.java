package me.tony.tonyirl.acount.jpa.entity;

import lombok.Data;
import me.tony.tonyirl.account.base.enums.EncryptTypeEnum;
import me.tony.tonyirl.acount.jpa.converter.EncryptTypeEnumConverter;

import javax.persistence.*;
import java.util.Date;

/**
 * @author tony
 * @since 18-4-20
 */
@Data
@Entity
@Table(name = "r_account_pass",
        indexes = @Index(columnList = "account_key", unique = true))
public class AccountPassword {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "account_key", nullable = false, length = 64)
    private String accountKey;
    @Column(name = "account_password", nullable = false, length = 128)
    private String password;
    @Column(name = "encrypt_type", nullable = false, length = 16)
    @Convert(converter = EncryptTypeEnumConverter.class)
    private EncryptTypeEnum type;
    @Column(name = "insert_time", nullable = false)
    @GeneratedValue
    private Date insertTime;
    @Column(name = "update_time", nullable = false)
    @GeneratedValue
    private Date updateTime;
    @Column(name = "is_visible", nullable = false)
    private Boolean visible;
}
