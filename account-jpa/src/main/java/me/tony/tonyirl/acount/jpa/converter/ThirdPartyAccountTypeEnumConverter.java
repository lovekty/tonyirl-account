package me.tony.tonyirl.acount.jpa.converter;

import me.tony.tonyirl.account.base.enums.ThirdPartyAccountTypeEnum;
import me.tony.tonyirl.acount.jpa.converter.base.BaseEnumNameAndStringConverter;


/**
 * @author tony
 * @since 18-4-19
 */
public class ThirdPartyAccountTypeEnumConverter extends BaseEnumNameAndStringConverter<ThirdPartyAccountTypeEnum> {

    public ThirdPartyAccountTypeEnumConverter() {
        super(ThirdPartyAccountTypeEnum.class);
    }
}
