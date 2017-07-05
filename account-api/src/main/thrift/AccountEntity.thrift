namespace java me.tony.tonyirl.account.api.dto

include 'AccountEnum.thrift'

struct Account{
1:i64 id
2:string accountKey
3:string email
4:string mobile
5:string nickname
6:AccountEnum.AccountStatus accountStatus
}

struct AccountPassword{
1:i64 id
2:string accountPassword
3:AccountEnum.PasswordEncryptType encryptType
}