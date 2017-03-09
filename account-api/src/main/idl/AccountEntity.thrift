namespace java me.tony.tonyirl.account.api.dto

include 'AccountEnum.thrift'

struct Account{
1:string accountKey
2:string email
3:string mobile
4:string nickname
5:AccountEnum.AccountStatus accountStatus
}

struct AccountPassword{
1:string accountPassword
2:AccountEnum.PasswordEncryptType encryptType
}