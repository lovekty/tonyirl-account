package me.tony.tonyirl.acount.jpa.entity;

import lombok.Data;
import me.tony.tonyirl.account.base.enums.ThirdPartyAccountTypeEnum;
import me.tony.tonyirl.acount.jpa.converter.ThirdPartyAccountTypeEnumConverter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author tony
 * @since 18-4-19
 */
@Data
@Entity
@Table(name = "r_account_oauth20",
        indexes = @Index(columnList = "account_key, account_type", unique = true))
public class AccountOAuth2Info implements Serializable {
    private static final long serialVersionUID = 8517757584385029476L;
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "account_key", nullable = false, length = 64)
    private String accountKey;
    @Column(name = "access_token", nullable = false, length = 128)
    private String accessToken;
    @Column(name = "account_type", nullable = false, length = 16)
    @Convert(converter = ThirdPartyAccountTypeEnumConverter.class)
    private ThirdPartyAccountTypeEnum type;
    @Column(name = "insert_time", nullable = false)
    @GeneratedValue
    private Date insertTime;
    @Column(name = "update_time", nullable = false)
    @GeneratedValue
    private Date updateTime;
    @Column(name = "is_visible", nullable = false)
    private Boolean visible;
}
