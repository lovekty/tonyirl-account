namespace java me.tony.tonyirl.account.api

include 'AccountEntity.thrift'

typedef AccountEntity.Account Account
typedef AccountEntity.SessionInfo SessionInfo
typedef AccountEntity.AuthenticationResult AuthenticationResult

service AccountApi{

    Account getById(1:i64 id)

    Account getByKey(1:string key)

    Account getByEmail(1:string email)

    Account getByMobile(1:string mobile)

    AuthenticationResult authenticate(1:string principal, 2: binary credential)

}
