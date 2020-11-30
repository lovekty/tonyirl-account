package me.tonyirl.account.service.provider

import me.tonyirl.account.thrift.api.AccountService
import me.tonyirl.account.thrift.api.model.Account
import org.springframework.stereotype.Service

/**
 * @author tony.zhuby
 * @date 2020/11/30
 */
@Service
class ApiService :AccountService.Iface {
    override fun getById(id: String?): Account {
        TODO("Not yet implemented")
    }

    override fun getByEmail(email: String?): Account {
        TODO("Not yet implemented")
    }

    override fun getByMobile(mobile: String?): Account {
        TODO("Not yet implemented")
    }
}