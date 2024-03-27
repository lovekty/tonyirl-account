package cn.bootz.account.inf.jpa

import cn.bootz.account.domain.AccountState
import jakarta.persistence.AttributeConverter
import jakarta.persistence.Converter

@Converter(autoApply = true)
class AccountStateConverter : AttributeConverter<AccountState, Short> {
    override fun convertToDatabaseColumn(attribute: AccountState?): Short? = attribute?.code?.toShort()

    override fun convertToEntityAttribute(dbData: Short?): AccountState? =
        dbData?.let { AccountState.forCode(it.toInt()) }
}