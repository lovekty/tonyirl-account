package cn.bootz.account.domain

import cn.bootz.account.common.trait.WithCode

enum class AccountState(override val code: Int) : WithCode {
    INACTIVE(1),
    ACTIVATED(2),
    LOCKED(3),
    CANCELED(4),
    EXPIRED(5);

    companion object {
        fun forCode(code: Int?) = WithCode.forCode<AccountState>(code)
    }
}