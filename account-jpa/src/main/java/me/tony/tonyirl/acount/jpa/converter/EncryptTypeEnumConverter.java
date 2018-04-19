package me.tony.tonyirl.acount.jpa.converter;

import me.tony.tonyirl.account.base.enums.EncryptTypeEnum;
import me.tony.tonyirl.acount.jpa.converter.base.BaseEnumNameAndStringConverter;

/**
 * @author tony
 * @since 18-4-20
 */
public class EncryptTypeEnumConverter extends BaseEnumNameAndStringConverter<EncryptTypeEnum> {
    public EncryptTypeEnumConverter() {
        super(EncryptTypeEnum.class);
    }
}
