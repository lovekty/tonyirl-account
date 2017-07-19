namespace java me.tony.tonyirl.account.api.dto

include 'AccountEnum.thrift'

typedef AccountEnum.AccountStatus AccountStatus
typedef AccountEnum.AuthenticationCode AuthenticationCode

struct Account{
1:i64 id
2:string accountKey
3:string email
4:string mobile
5:string nickname
6:AccountStatus accountStatus
}

struct AuthenticationResult {
1:bool succ
2:AuthenticationCode code
3:string msg
4:optional Account session
}