namespace java me.tony.tonyirl.account.api

include 'AccountEntity.thrift'

service AccountApi{

    AccountEntity.Account getById(1:i64 id)

    AccountEntity.Account getByKey(1:string key)

    AccountEntity.Account getByEmail(1:string email)

    AccountEntity.Account getByMobile(1:string mobile)

}

service AccountPasswordApi{
    AccountEntity.AccountPassword getById(1:i64 id)
}