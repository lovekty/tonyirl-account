package me.tony.tonyirl.account.orm.mybatis.typehandler;

import me.tony.tonyirl.account.orm.enums.EncryptTypeEnum;
import org.apache.ibatis.type.EnumTypeHandler;

/**
 * Created by tony on 2017/2/28.
 */
public class EncryptTypeEnumTypeHandler extends EnumTypeHandler<EncryptTypeEnum> {
    public EncryptTypeEnumTypeHandler() {
        super(EncryptTypeEnum.class);
    }
}
