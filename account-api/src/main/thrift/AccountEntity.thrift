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

struct SessionInfo{
1:string sessionId
2:Account account
3:i64 sessionStartTimestamp
4:i64 expireSeconds # 0 for eternal
}

struct AuthenticationResult {
1:bool succ
2:optional SessionInfo session
}