package cn.bootz.account.application.command

data class RegisterAccountCommand(
    var login: String,
    var password: String
)