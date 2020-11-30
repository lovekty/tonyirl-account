namespace java me.tonyirl.account.thrift.api

include 'account_model.thrift'

typedef account_model.Account Account

service AccountService{
    Account getById(1:required string id)
    Account getByEmail(1:required string email)
    Account getByMobile(1:required string mobile)
}
