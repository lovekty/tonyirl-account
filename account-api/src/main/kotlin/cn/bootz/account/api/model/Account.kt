package cn.bootz.account.api.model

data class Account(
    var id: Long? = null,
    var login: String? = null,
    var nickname: String? = null,
    var avatar: String? = null
)