package me.tony.tonyirl.account.remote.provider;

import me.tony.tonyirl.account.api.AccountApi;
import me.tony.tonyirl.account.api.dto.Account;
import org.apache.thrift.TException;

/**
 * Created by tony on 2017/3/9.
 */
public class AccountApiProvider implements AccountApi.Iface {
    @Override
    public Account getById(long id) throws TException {
        return null;
    }

    @Override
    public Account getByKey(String key) throws TException {
        return null;
    }

    @Override
    public Account getByEmail(String email) throws TException {
        return null;
    }

    @Override
    public Account getByMobile(String mobile) throws TException {
        return null;
    }
}
