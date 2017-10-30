package me.tony.tonyirl.account.service.model;

import lombok.Data;
import me.tony.tonyirl.account.base.enums.AccountStatusEnum;

/**
 * 临时替代 thrift model
 * <blockquote><pre class=code>
 * struct Account{
 * 1:i64 id
 * 2:string accountKey
 * 3:string email
 * 4:string mobile
 * 5:string nickname
 * 6:AccountStatus accountStatus
 * }
 * </pre></blockquote>
 *
 * @author tony
 */
@Data
public class Account {

    private Long id;
    private String accountKey;
    private String email;
    private String mobile;
    private String nickname;
    private AccountStatusEnum accountStatus;

}
