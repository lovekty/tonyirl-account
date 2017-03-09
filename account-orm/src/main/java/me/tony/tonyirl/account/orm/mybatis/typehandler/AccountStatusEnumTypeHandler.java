package me.tony.tonyirl.account.orm.mybatis.typehandler;

import me.tony.tonyirl.account.base.enums.AccountStatusEnum;
import org.apache.ibatis.type.EnumTypeHandler;

/**
 * Created by tony on 2017/2/28.
 */
public class AccountStatusEnumTypeHandler extends EnumTypeHandler<AccountStatusEnum> {
    public AccountStatusEnumTypeHandler() {
        super(AccountStatusEnum.class);
    }
}
