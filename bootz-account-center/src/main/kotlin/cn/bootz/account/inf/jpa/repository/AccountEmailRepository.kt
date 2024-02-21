package cn.bootz.account.inf.jpa.repository

import cn.bootz.account.inf.jpa.entity.AccountBindingEmail
import org.springframework.data.jpa.repository.JpaRepository

interface AccountEmailRepository : JpaRepository<AccountBindingEmail, Long>