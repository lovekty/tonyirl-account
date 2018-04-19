package me.tony.tonyirl.acount.jpa.converter;

import me.tony.tonyirl.account.base.enums.AccountStatusEnum;
import me.tony.tonyirl.acount.jpa.converter.base.BaseEnumNameAndStringConverter;


/**
 * @author tony
 * @since 18-4-19
 */
public class AccountStatusEnumConverter extends BaseEnumNameAndStringConverter<AccountStatusEnum> {

    public AccountStatusEnumConverter() {
        super(AccountStatusEnum.class);
    }
}
