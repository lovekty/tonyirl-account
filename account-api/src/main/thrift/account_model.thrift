namespace java me.tonyirl.account.thrift.api.model

enum AccountState{
VALID = 1
SUSPENDED = 2
BANNED = 3
}

struct Account{
1:required string accountId
2:optional string email
3:optional string mobile
4:optional string nickname
5:required AccountState accountState
}
